package org.example.HW_O_1;

public class Basket {
    private String[] buyPr;

    public Basket(String[] buyPr) {
        this.buyPr = buyPr;
    }
    public Basket() {
    }
    public String[] getBuyPr() {
        return buyPr;
    }

    public void setBuyPr(String[] buyPr) {
        this.buyPr = buyPr;
    }
}
