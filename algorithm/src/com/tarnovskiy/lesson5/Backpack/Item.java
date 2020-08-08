package com.tarnovskiy.lesson5.Backpack;

/**
 * @author Tarnovskiy Maksim
 */
public class Item {
    private double weigth;
    private double price;

    public Item( double weigth, double price) {
        this.weigth = weigth;
        this.price = price;
    }

    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }

    public double getCost() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "weigth=" + weigth +
                ", price=" + price +
                '}';
    }
}
