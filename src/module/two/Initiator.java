package module.two;

public class Initiator {
    private SortBuble sortBuble;
    private SortInsert sortInsert;

    public Initiator(SortInsert sortInsert, SortBuble sortBuble){
        this.sortBuble = sortBuble;
        this.sortInsert = sortInsert;
    }

    public void initStart(){
        System.out.println("Запускаю сортировку пузыфрьком ");
        sortBuble.sortTimeBuble();
        System.out.println("Завершено");
        System.out.println("==================================================");
        System.out.println("Запускаю сортировку вставками ");
        sortInsert.sortTimeInsert();
        System.out.println("Завершено");
        System.out.println("==================================================");
    }
}
