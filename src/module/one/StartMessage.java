package module.one;

public class StartMessage {

    public static void main(String[] args) {

        MessagerMail messagerMail = new MessagerMail();
        RecipientOne rOne = new RecipientOne(messagerMail);
        RecipientTwo rTwo = new RecipientTwo();
        messagerMail.registreObserver(rTwo);
        messagerMail.sendMessuremens();
    }
}
