package org.example.HW_O_7;

public class Log implements Loggable{
    @Override
    public void saveLog(String str) {
        System.out.println("Log: " + str);
    }
}