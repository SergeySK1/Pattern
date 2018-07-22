package module.three;

public class StartSelectSort {

    public static void main(String[] args) {
        Sorter sorter = new Sorter(new Buble());
        sorter.install();
        sorter.setSort(new Insert());
        sorter.install();
    }
}
