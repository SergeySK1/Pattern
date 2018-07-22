package module.one;

public class RecipientOne implements ObserverListener {

    private EventCreate messagerMail;

    public RecipientOne(EventCreate messagerMail){
        this.messagerMail = messagerMail;
        messagerMail.registreObserver(this);
    }

    @Override
    public void update(String str) {
        System.out.println(RecipientOne.class.getName() + " " + str);
    }
}
