package module.one;


import java.util.ArrayList;

public class MessagerMail implements EventCreate {

    private ArrayList<ObserverListener> observers;
    private static ArrayList<String> postmanList;

    public MessagerMail(){
        observers = new ArrayList();
        postmanList = Postman.initPostmam().createСirculation();
    }


    @Override
    public void registreObserver(ObserverListener observerListener) {
        observers.add(observerListener);
    }

    @Override
    public void removeObserver(ObserverListener observerListener) {
        int i = observers.indexOf(observerListener);
        if(i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifayObservers() {
        for (int i = 1; i < postmanList.size(); i++) {
            for (int j = 0; j < observers.size(); j++) {
                ObserverListener ol =  observers.get(j);
                try {
                    Thread.sleep(1500);
                }catch (InterruptedException iE){
                    System.out.println(iE  );
                }
                ol.update(postmanList.get(i));
            }
        }
    }

    public void sendMessuremens(){
        notifayObservers();
    }
}
