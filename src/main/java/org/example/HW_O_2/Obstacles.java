package org.example.HW_O_2;

public abstract class Obstacles {
    private String name;

    public Obstacles(String name) {
        this.name = name;
    }

    protected abstract boolean moving(Inter actions);

    public String getName() {
        return name;
    }
}
