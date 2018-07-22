package module.three;

public class Sorter {

    private Sort sort;

    public Sorter(Sort sort){
        this.sort = sort;
    }

    public void setSort(Sort sort){
        this.sort = sort;
    }

    public void install(){
        sort.algorytmSort();
    }

}
