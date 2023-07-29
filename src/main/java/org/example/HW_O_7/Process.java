package org.example.HW_O_7;

public class Process implements ProcessInter {
    public Teams create(int primaryArg, boolean logFlag) {
        if (logFlag) {
            Teams calculator =  new Calculator(primaryArg);
            return new Recording(calculator);
        }
        return new Calculator(primaryArg);
    }
}