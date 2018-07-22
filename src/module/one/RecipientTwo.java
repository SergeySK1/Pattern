package module.one;

public class RecipientTwo implements ObserverListener {


    @Override
    public void update(String str) {
        System.out.println(RecipientTwo.class.getName() + " " + str);
    }
}
