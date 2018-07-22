package module.two;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Date {

    private static Random randomDate;
    private static ArrayList<int[]> dataArrayList;
    private int[] dateArray;
    private static List<Date> freePoolDate;
    private static List<Date> usedPoolDate;

    private Date(){
        randomDate = new Random();
        dataArrayList = new ArrayList<>();
        fillDate();
    }

    public static Date getInstanse(){
        freePoolDate = new ArrayList<>(10);
        usedPoolDate = new ArrayList<>(10);

        if(freePoolDate.isEmpty()){
            Date date = new Date();
            freePoolDate.add(date);
            return date;
        } else{
            Date date = freePoolDate.get(0);
            usedPoolDate.add(date);
            freePoolDate.remove(date);
            return date;
        }
    }

    public static Date getInstanse(int number){
        if(!usedPoolDate.isEmpty()){
            if (number <= 10){
                return usedPoolDate.get(number);
            }
        }
        return getInstanse();
    }

    private void fillDate() {
        for (int i = 0; i < 10; i++) {
            dateArray = new int[10];
            for (int j = 0; j < dateArray.length; j++) {
                dateArray[j] = randomDate.nextInt(100);
            }
            dataArrayList.add(dateArray);
        }
    }

    public static ArrayList<int[]> getData(){
            return dataArrayList;
        }

    }

