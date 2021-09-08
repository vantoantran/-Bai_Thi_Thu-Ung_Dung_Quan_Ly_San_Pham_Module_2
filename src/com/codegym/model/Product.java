package com.codegym.model;

public class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;
    private String about;

    public Product() {
    }

    public Product(int id, String name, double price, int quantity, String about) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.about = about;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", name=" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", about=" + about;
    }
}
