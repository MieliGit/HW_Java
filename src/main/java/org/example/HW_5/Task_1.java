package org.example.HW_5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {

        String text = "Скучные песни, грустные звуки,\n" +
                "Дайте свободно вздохнуть.\n" +
                "Вы мне приносите тяжкие муки,\n" +
                "Больно терзаете грудь.\n" +
                "\n" +
                "Дайте отрады, дайте покоя,\n" +
                "Дайте мне крепко заснуть.\n" +
                "Думы за думами смутного роя,\n" +
                "Вы мне разбили мой путь.\n" +
                "\n" +
                "Смолкните, звуки — вестники горя,\n" +
                "Слезы уж льются из глаз.\n" +
                "Пусть успокоится горькая доля.\n" +
                "Звуки! Мне грустно от вас!\n" +
                "\n" +
                "Звуки печали, скорбные звуки,\n" +
                "Долго ль меня вам томить?\n" +
                "Скоро ли кончатся тяжкие муки,\n" +
                "Скоро ль спокойно мне жить?";

        System.out.println(text);

        System.out.println("  ");
        text = text.replaceAll("[-|–|—]|\\p{Punct}", " ");
        while (text.contains("  ")){
            text = text.replace("  ", " ");
        }

        Scanner input = new Scanner(System.in);
        System.out.print("Искомое слово: ");
        String Search = input.next();

        String[] arrayText = text.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (String wordinText : arrayText){
            if (!Search.toLowerCase().equals(wordinText.toLowerCase())){
                continue;
            }

            int count = map.getOrDefault(Search.toLowerCase(), 0);
            map.put(wordinText.toLowerCase(), ++count);
        }

        System.out.println("Слов найдено: " + map.getOrDefault(Search.toLowerCase(), 0));

    }
}

