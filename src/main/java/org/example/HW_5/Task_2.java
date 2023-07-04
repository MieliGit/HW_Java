package org.example.HW_5;

import java.util.HashMap;
import java.util.Map;

public class Task_2 {
    public static void main(String[] args) {
        String text = "Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин, " +
                "Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова," +
                " Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов";
        System.out.println("");


        while (text.contains("  ")){
            text = text.replace("  ", " ");
        }
        String[] arrayText = text.split(" ");

        Map<String, Integer> map = getCountWords(arrayText);

        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue() > 1) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }
    }

    public static Map<String, Integer> getCountWords(String[] array){
        Map<String, Integer> map = new HashMap<>();

        for (String current : array){
            int count = map.getOrDefault(current.toLowerCase(), 0);
            map.put(current.toLowerCase(), ++count);
        }

        return map;
    }
}
