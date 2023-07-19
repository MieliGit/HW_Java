package org.example.HW_O_4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        SimpleBox intBox1 = new SimpleBox(10);
//        SimpleBox intBox2 = new SimpleBox(20);
//
//
//        int sum = (Integer) intBox1.getObj() + (Integer) intBox2.getObj();
//        System.out.println("sum = " + sum);
//
//        intBox2.setObj("10");
//        if (intBox1.getObj() instanceof Integer && intBox2.getObj() instanceof Integer) {
//            int sum2 = (Integer) intBox1.getObj() + (Integer) intBox2.getObj();
//            System.out.println("sum2 = " + sum2);
//        }
//        GenBox<Integer> gen1 = new GenBox(15);
//        GenBox<Integer> gen2 = new GenBox(10);
//        int sum3 = gen1.getObj() + gen2.getObj();
//        System.out.println("sum3 = " + sum3);
        Calculator calc = new Calculator();
        List<Double> sumList = new ArrayList<>();
        List<Double> multList = new ArrayList<>();
        List<Double> diviList = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            sumList.add((double)i);
            multList.add((double)i);
            diviList.add((double)i);
        }
        System.out.println("calc.sum(sumList) = " + calc.sum(sumList));
        System.out.println("calc.mult(multList) = " + calc.mult(multList));
        System.out.println("calc.divi(diviList) = " + calc.divi(diviList));


    }
}
