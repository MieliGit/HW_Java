package org.example.HW_O_7;

public class Recording implements Teams {

    protected Teams calc;
    Loggable calcLogger = new Log();


    public Recording(Teams calc) {
        calcLogger.saveLog("" + calc.getResult());
        this.calc = calc;
    }


    @Override
    public Teams sum(int arg) {
        calcLogger.saveLog(calc.getResult() + " + " + arg);
        return this.calc.sum(arg);
    }

    @Override
    public Teams multi(int arg) {
        calcLogger.saveLog(calc.getResult() + " * " + arg);
        return this.calc.multi(arg);
    }

    public Teams div(int arg) {
        calcLogger.saveLog(calc.getResult() + " / " + arg);
        return this.calc.div(arg);
    }

    public Teams dif(int arg) {
        calcLogger.saveLog(calc.getResult() + " - " + arg);
        return this.calc.dif(arg);
    }
    @Override
    public int getResult() {
        int result = this.calc.getResult();
        calcLogger.saveLog(" = " + result);
        return this.calc.getResult();
    }
}