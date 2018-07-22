package module.two;

public class StartSort {

    public static void main(String[] args) {
        Initiator in = new Initiator(new SortInsert(), new SortBuble());
        in.initStart();
    }
}
