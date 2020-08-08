package com.tarnovskiy.lesson5.Backpack;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Tarnovskiy Maksim
 */
public class Backpack {
    private List<Item> bestItems = null;

    private double maxWeight;
    private double bestCoust;

    private static int calcCost(List<Item> costThing) {
        int count = 0;
        for (Item item :
                costThing) {
            count += item.getCost();
        }
        return count;
    }

    private static int calcWeigth(List<Item> weightThing) {
        int count = 0;
        for (Item item:
                weightThing) {
            count += item.getWeigth();
        }
        return count;
    }

    private void checkSet(List<Item> items) {
        if (this.bestItems == null) {
            if (this.calcWeigth(items) <= this.maxWeight) {
                this.bestItems = items;
                this.bestCoust = this.calcCost(items);
            }
        } else {
            if (this.calcWeigth(items) <= this.maxWeight && this.calcCost(items) > this.bestCoust) {
                this.bestItems = items;
                this.bestCoust = this.calcCost(items);
            }
        }
    }
    public void makeAllSets(List<Item> items) {
        if (items.size() > 0) {
            this.checkSet(items);
        }
        for (int i = 0; i < items.size(); i++) {
            List<Item> newSet = new ArrayList<>(items);
            newSet.remove(i);
            makeAllSets(newSet);
        }
    }


    public Backpack(double maxW) {
        this.maxWeight = maxW;
    }

    public List<Item> getBestItems() {
        return this.bestItems;
    }

}
