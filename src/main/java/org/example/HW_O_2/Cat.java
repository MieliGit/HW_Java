package org.example.HW_O_2;

public class Cat implements Inter{
    private String Cname;
    private int Cspeedrun;
    private int Cheightjump;

    public Cat(String Cname, Integer Cspeedrun, Integer Cheightjump){
        this.Cname = Cname;
        this.Cspeedrun = Cspeedrun;
        this.Cheightjump = Cheightjump;
    }
    @Override
    public void run() {
        System.out.println("Кот " + this.Cname + " бежит " + this.getRunDistance());
    }

    @Override
    public void jump() {
        System.out.println("Кот " + this.Cname + " прыгает " + this.getJumpHeight());
    }

    @Override
    public int getRunDistance() {
        return this.Cspeedrun;
    }

    @Override
    public int getJumpHeight() {
        return this.Cheightjump;
    }
}
