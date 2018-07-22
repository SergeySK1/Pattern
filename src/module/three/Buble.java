package module.three;

import java.util.Arrays;
import java.util.Random;

public class Buble implements Sort {

    private int[] arr;
    private Random r;

    public Buble(){
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
        System.out.println("Сортировка пузырьком");
        int num;
        boolean isSorted = false;
        while(!isSorted) {
            isSorted = true;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    isSorted = false;
                    num = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = num;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
