package org.example.HW_3;

import java.util.Random;
import java.util.ArrayList;

public class Task_4 {
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


                
                for(int i=0; i<numlst.size(); i++){
                    if (numlst.get(i) > max) {
                        max = numlst.get(i);
                    }

                    if (numlst.get(i) < min) {
                        min = numlst.get(i);
                    }
                    sum=sum+numlst.get(i);
                }

                int med = (int) (sum/numlst.size());

                System.out.printf("Максимальный : %d\n",max);
                System.out.printf("Минимальный : %d\n",min);
                System.out.printf("Среднее : %d\n",med);


    }
}
