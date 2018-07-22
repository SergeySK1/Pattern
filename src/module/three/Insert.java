package module.three;

import java.util.Arrays;
import java.util.Random;

public class Insert implements Sort {
   private int[] arr;
   Random r;

    public Insert() {
        arr = new int[10];
        r = new Random();
        fillArr();
    }

    public void fillArr(){
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = r.nextInt(1000);
        }
    }

    @Override
    public void algorytmSort() {
        System.out.println("Сортировка вставками");
        int temp, num;
        for (int j = 0; j < arr.length - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                temp = arr[j + 1];
                arr[j + 1] = arr[j];
                num = j;
                while (num > 0 && temp < arr[num - 1]) {
                    arr[num] = arr[num - 1];
                    num--;
                }
                arr[num] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
