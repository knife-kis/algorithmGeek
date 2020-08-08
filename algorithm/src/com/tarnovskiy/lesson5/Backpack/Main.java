package com.tarnovskiy.lesson5.Backpack;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Tarnovskiy Maksim
 */
public class Main {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        items = createItem(10, items);

        Backpack backpack = new Backpack(8);
        backpack.makeAllSets(items);
        System.out.println(items);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(backpack.getBestItems());
    }
    private static List<Item> createItem(int thing, List<Item> items) {
        for (int i = 0; i < thing; i++) {
            Random random = new Random();
            items.add(new Item(random.nextInt(10), random.nextInt(100)));
        }
        return items;

    }
}
