package org.example.HW_O_7;

public final class Calculator implements Teams {

    private int primaryArg;

    public Calculator(int primaryArg) {
        this.primaryArg = primaryArg;
    }

    @Override
    public Teams sum(int arg) {
        primaryArg += arg;
        return this;
    }

    @Override
    public Teams multi(int arg) {
        primaryArg *= arg;
        return this;
    }
    public Teams div(int arg) {
        primaryArg /= arg;
        return this;
    }

    public Teams dif(int arg) {
        primaryArg -= arg;
        return this;
    }
    @Override
    public int getResult() {
        return primaryArg;
    }
}