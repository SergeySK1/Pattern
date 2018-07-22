package module.one;

public interface EventCreate {

     void registreObserver(ObserverListener observerListener);

     void removeObserver(ObserverListener observerListener);

     void notifayObservers();
}
