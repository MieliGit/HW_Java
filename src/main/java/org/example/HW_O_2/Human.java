package org.example.HW_O_2;

public class Human implements Inter{
    private String name;
    private int speedrun;
    private int heightjump;

    public Human(String name, Integer speedrun, Integer heightjump){
        this.name = name;
        this.speedrun = speedrun;
        this.heightjump = heightjump;
    }
    @Override
    public void run() {
        System.out.println("Человек " + this.name + " бежит " + this.getRunDistance());
    }

    @Override
    public void jump() {
        System.out.println("Человек " + this.name + " прыгает " + this.getJumpHeight());
    }

    @Override
    public int getRunDistance() {
        return this.speedrun;
    }

    @Override
    public int getJumpHeight() {
        return this.heightjump;
    }


}

