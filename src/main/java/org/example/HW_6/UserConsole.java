package org.example.HW_6;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Map.Entry;
import java.util.*;

public class UserConsole {
    public static void main(String[] args) {
        Laptop item1 = new Laptop("ASUS M1502IA-BQ093", "grey",
                "Windows", 52999, 16, 512);
        Laptop item2 = new Laptop("Apple MacBook Air 13", "gold",
                "macOS", 89999, 8, 256);
        Laptop item3 = new Laptop("Apple MacBook Air 15", "grey",
                "macOS", 164999, 8, 256);
        Laptop item4 = new Laptop("HUAWEI 53013ERR BoD-WDH9 MateBook",
                "black", "Windows", 54999, 8, 512);
        Laptop item5 = new Laptop("HUAWEI MateBook D16", "blue",
                "Windows", 76999, 16, 512);
        Laptop item6 = new Laptop("HONOR MagicBook X", "grey",
                "Windows", 68999, 8, 512);
        Laptop item7 = new Laptop("Acer Nitro 5 AN515-57", "gold",
                "Windows", 79999, 16, 512);

        HashSet <Laptop> res = new HashSet<>();
        List<Laptop> LaptopList = new ArrayList<>();
        LaptopList.add(item1);
        LaptopList.add(item2);
        LaptopList.add(item3);
        LaptopList.add(item4);
        LaptopList.add(item5);
        LaptopList.add(item6);
        LaptopList.add(item7);

        System.out.println("LaptopList = " + LaptopList);
        System.out.println();

        System.out.println("По какому критерию хотите провести сортировку:\n 1 - ОЗУ \n 2 - Объем ЖД \n " +
                "3 - Операционная система \n 4 - цвет \n 5 - чтобы осуществить поиск\n");
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        sc.nextLine();
        HashMap<String, Object> filters = new HashMap<>();
        while (n != 5) {
            if (n == 1) {
                System.out.println("Введите минимальную оперативную память");
                Integer temp = sc.nextInt();
                sc.nextLine();
                filters.put("Ram", temp);
            }
            if (n == 2) {
                System.out.println("Введите минимальный объем ЖД");
                Integer temp = sc.nextInt();
                sc.nextLine();
                filters.put("Disk", temp);
            }
            if (n == 3) {
                System.out.println("Введите ОС");
                String temp = sc.nextLine();
                filters.put("System", temp);
            }
            if (n == 4) {
                System.out.println("Введите цвет");
                String temp = sc.nextLine();
                filters.put("ColorName", temp);
            }
            System.out.println("Введите цифру, соответствующую необходимому критерию:\n 1 - ОЗУ \n 2 - Объем ЖД \n" +
                    " 3 - Операционная система \n 4 - цвет \n 5 - начать поиск\n");
            n = sc.nextInt();
            sc.nextLine();
        }

        for (Entry<String, Object> entry : filters.entrySet()) {
            if(entry.getKey().equals("Ram")){
                Iterator it = LaptopList.iterator();
                while(it.hasNext()){
                    Laptop lap = (Laptop) it.next();
                    if(lap.getRam()>=(Integer)entry.getValue()){
                        res.add(lap);
                    }
                }
            }
            if(entry.getKey().equals("Disk")){
                Iterator it = LaptopList.iterator();
                while(it.hasNext()){
                    Laptop lap = (Laptop)it.next();
                    if(lap.getDisk()>=(Integer)entry.getValue()){
                        res.add(lap);
                    }
                }
            }
            if(entry.getKey().equals("System")){
                Iterator it = LaptopList.iterator();
                while(it.hasNext()){
                    Laptop lap = (Laptop)it.next();
                    if(lap.getSystem().equals(entry.getValue())){
                        res.add(lap);
                    }
                }
            }
            if(entry.getKey().equals("ColorName")){
                Iterator it = LaptopList.iterator();
                while(it.hasNext()){
                    Laptop lap = (Laptop)it.next();
                    if(lap.getColorName().equals(entry.getValue())){
                        res.add(lap);
                    }
                }
            }
        }

        Iterator it = res.iterator();
        while(it.hasNext()){
            Laptop lap = (Laptop)it.next();
            System.out.println(lap.toString());
            System.out.println();
        }
    }
}
