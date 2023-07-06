package org.example.HW_3_3;

import java.util.ArrayList;
import java.util.Random;

public class Task_1 {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> numlst = new ArrayList<Integer>();
        for (int i=0;i<10;i++){
            numlst.add(rnd.nextInt(0,10));
        }

        System.out.println(numlst.toString());
        int max = numlst.get(0);
        int min = numlst.get(0);
        int sum = 0;
        int j = 0;



        for(int i=0; i<numlst.size(); i++){
            if(numlst.get(i)%2 != 0){
                if (numlst.get(i) > max) {
                    max = numlst.get(i);
                }

                if (numlst.get(i) < min) {
                    min = numlst.get(i);
                }
                sum = sum + numlst.get(i);
                j++;
            }
        }

        int med = (int) (sum/j);

        System.out.printf("Максимальный : %d\n",max);
        System.out.printf("Минимальный : %d\n",min);
        System.out.printf("Среднее : %d\n",med);

    }
}
