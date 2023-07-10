package org.example.HW_O_1;


public class Product {
    private String name;
    private Double price;
    private Double rating;

    public Product(String name, Double price, Double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public Product() {
    }

    public String getNamePr() {
        return name;
    }

    public void setNamePr(String name) {
        this.name = name;
    }

    public Double getPricePr() {
        return price;
    }

    public void setPricePr(Double price) {
        this.price = price;
    }

    public Double getRatingPr() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }
}
