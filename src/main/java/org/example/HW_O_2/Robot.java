package org.example.HW_O_2;

public class Robot implements Inter{
    private String Rname;
    private int Rspeedrun;
    private int Rheightjump;

    public Robot(String Rname, Integer Rspeedrun, Integer Rheightjump){
        this.Rname = Rname;
        this.Rspeedrun = Rspeedrun;
        this.Rheightjump = Rheightjump;
    }
    @Override
    public void run() {
        System.out.println("Робот " + this.Rname + " бежит " + this.getRunDistance());
    }

    @Override
    public void jump() {
        System.out.println("Робот " + this.Rname + " прыгает " + this.getJumpHeight());
    }

    @Override
    public int getRunDistance() {
        return this.Rspeedrun;
    }

    @Override
    public int getJumpHeight() {
        return this.Rheightjump;
    }

}
