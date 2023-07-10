package org.example.HW_O_1;


public class Category {
    private String name;
    private String[] arrPr;

    public Category(String name, String[] arrPr) {
        this.name = name;
        this.arrPr = arrPr;
    }

    public Category() {
    }

    public String getNameCt() {
        return name;
    }

    public void setNameCt(String name) {
        this.name = name;
    }

    public String[] getArrPr() {
        return arrPr;
    }

    public void setArrPr(String[] arrPr) {
        for (int i = 0; i < arrPr.length; i++) {
            this.arrPr[i] = arrPr[i];}
    }
}
