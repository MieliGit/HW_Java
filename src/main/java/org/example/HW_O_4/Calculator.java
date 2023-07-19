package org.example.HW_O_4;

import java.util.List;

public class Calculator {
    public Double sum(List<? extends Number> numbers) {
        Double res = 0.0;
        for (Number number : numbers) {
            res += number.doubleValue();
        }
        return res;
    }

    public Double mult(List<? extends Number> numbers) {
        Double res = 1.0;
        for (Number number : numbers) {
            res *= number.doubleValue();
        }
        return res;
    }

    public Double divi(List<? extends Number> numbers) {
        Double res = 1.0;
        for (Number number : numbers) {
            res /= number.doubleValue();
        }
        return res;
    }
}
