package com.gaurav.foodapp.restfulservice.entities;

public class Item {

    private String name;
    private int quantity;
    private String weight; // 2KG

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public Item(String name, int quantity, String weight) {
        this.name = name;
        this.quantity = quantity;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", weight='" + weight + '\'' +
                '}';
    }
}
