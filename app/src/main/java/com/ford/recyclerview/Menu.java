package com.ford.recyclerview;

public class Menu {

    private String name;
    private String price;
    private int imageIcon;

    public Menu() {
    }

    public Menu(String name, String price, int imageIcon) {
        this.name = name;
        this.price = price;
        this.imageIcon = imageIcon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getImageIcon() {
        return imageIcon;
    }

    public void setImageIcon(int imageIcon) {
        this.imageIcon = imageIcon;
    }
}
