package module.two;

import java.util.ArrayList;
import java.util.Arrays;

public class SortInsert {

    private int[] sortArr;
    private Date date;
    private ArrayList<int[]> arrayDate;

    public SortInsert(){
        sortArr = new int[1000];
        date = Date.getInstanse();
        arrayDate = new ArrayList<>();
    }

    public void sortTimeInsert(){
        long start = System.nanoTime();
        arrayDate = date.getData();

        for (int i = 0; i < arrayDate.size()-1; i++) {
            sortArr = arrayDate.get(i);
            int temp, num;
            for(int j = 0; j < sortArr.length - 1; j++){
                if (sortArr[j] > sortArr[j + 1]) {
                    temp = sortArr[j + 1];
                    sortArr[j + 1] = sortArr[j];
                    num = j;
                    while (num > 0 && temp < sortArr[num - 1]) {
                        sortArr[num] = sortArr[num - 1];
                        num--;
                    }
                    sortArr[num] = temp;
                }
            }
            long end = System.nanoTime();
            System.out.println(Arrays.toString(sortArr));
            System.out.println(SortBuble.class.getName() + " Проход N " + i+ " время = " + (end - start));
            }
        }
}
