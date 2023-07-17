package org.example.HW_5_5;
import java.util.*;
public class Task_1 {
    static void sortedPrint(Map<String, ArrayList> map) {

        Set<String> keySet = map.keySet();

        int maxCount = 0;
        int minCount = 1000000;

        for (var item : map.entrySet()) {
            if (maxCount < item.getValue().size())
                maxCount = item.getValue().size();
            if (minCount > item.getValue().size())
                minCount = item.getValue().size();

        }
        Stack<String> st = new Stack<>();
        int num = minCount;
        while (num <= maxCount) {
            for (var item : map.entrySet()) {
                if (item.getValue().size() == num) {
                    st.push(item.getKey());
                }
            }
            num += 1;
        }
        String name;
        for (int i = 0; i < keySet.size(); i++) {
            name = st.pop();
            for (var item : map.entrySet()) {
                if (name == item.getKey()) {
                    System.out.printf("%8s: ", item.getKey());
                    System.out.println(item.getValue());
                }
            }
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Map<String, ArrayList> abon = new HashMap<>() {
            {
                put("Захаров", new ArrayList<Integer>() {
                    {
                        add(845634512);
                        add(674123456);
                        add(791361423);
                    }
                });
                put("Пупкин", new ArrayList<Integer>() {
                    {
                        add(555464123);
                    }
                });
                put("Шюпкин", new ArrayList<Integer>() {
                    {
                        add(124145774);
                        add(241415765);

                    }
                });
                put("Яблокин", new ArrayList<Integer>() {
                    {
                        add(612412422);
                        add(142141414);
                        add(212412657);
                        add(951235254);
                    }
                });
            }
        };
        System.out.println();
        System.out.println("Исходные данные: ");
        sortedPrint(abon);

        Scanner scanner = new Scanner(System.in);
        Boolean getOut = false;
        String st;
        while (!getOut) {
            System.out.println("Введите номер действия (1 - добавить абонента, 0 - выйти из программы):");
            st = scanner.nextLine();
            String name;
            String phString;
            switch (st) {
                case "1": {
                    System.out.println("Введите фамилию абонента:");
                    name = scanner.nextLine();
                    if (abon.containsKey(name)) {
                        System.out.println("Такая фамилия уже есть");
                        System.out.println();
                        break;
                    } else {
                        System.out.println("Введите номера телефонов через пробел: ");
                        phString = scanner.nextLine();
                        String[] arr = phString.split(" ");
                        ArrayList<Integer> arrInt = new ArrayList<>();
                        for (String item: arr) {
                            arrInt.add(Integer.parseInt(item.trim())) ;
                        }
                        abon.put(name, arrInt);
                        System.out.println();
                        sortedPrint(abon);
                        break;
                    }
                }
                case "0": {
                    getOut = true;
                    System.out.println();
                    System.out.println("До свидания!");
                    System.out.println();
                    break;
                }

            }
        }
    }

}
