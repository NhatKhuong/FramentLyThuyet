package com.example.frament;

import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private String name;
    private String description;
    private int img;
    private double price;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImg() {
        return img;
    }

    public double getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product(int id, String name, String description, int img, double price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.img = img;
        this.price = price;
    }
}
