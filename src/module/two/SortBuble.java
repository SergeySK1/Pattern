package module.two;

import java.util.ArrayList;
import java.util.Arrays;

public class SortBuble {

    private int[] sortArr;
    private Date date;
    private ArrayList<int[]> arrayDate;

    public SortBuble(){
        sortArr = new int[10];
        date = Date.getInstanse();

    }

    public void sortTimeBuble(){
        long start = System.nanoTime();
        arrayDate = date.getData();

        for (int i = 0; i < arrayDate.size()-1; i++) {
            sortArr = arrayDate.get(i);
            int num;
            boolean isSorted = false;
            while(!isSorted) {
                isSorted = true;
                for (int j = 0; j < sortArr.length - 1; j++) {
                    if (sortArr[j] > sortArr[j + 1]) {
                        isSorted = false;
                        num = sortArr[j];
                        sortArr[j] = sortArr[j + 1];
                        sortArr[j + 1] = num;
                    }
                }
            }
            long end = System.nanoTime();
            System.out.println(Arrays.toString(sortArr));
            System.out.println(SortBuble.class.getName() + " Проход N " + i+ " время = " + (end - start));
        }
    }


}
