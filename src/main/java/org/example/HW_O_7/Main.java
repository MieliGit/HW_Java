package org.example.HW_O_7;

public class Main {
    public static void main(String[] args) {
        ProcessInter calculableFactory = new Process();
        View view = new View(calculableFactory);
        view.run();
    }
}