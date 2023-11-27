package com.workintech.shoppingcart;

import java.util.ArrayList;
import java.util.Collections;

public class GroceryList {
    private ArrayList<String> items;

    public GroceryList() {
    }

    public void addItems(String items) {
        if (items.contains(",")) {
            String[] splitItems = items.split(",");
            for (String item : splitItems) {
                String trimmedItem = item.trim();
                if (checkItemIsInList(trimmedItem)) System.out.println("Item " + item + " is already in the list.");
                else this.items.add(trimmedItem);
                printSorted();
            }
        }
        else {
            this.items.add(items);
        }
    }

    public void removeItems(String items) {
        String[] splitItems = items.split(",");
        for(String item: splitItems) {
            String trimmedItem = item.trim();
            if (checkItemIsInList(trimmedItem)) this.items.remove(trimmedItem);
            else System.out.println("Item " + item + " is already in the list.");
        }
    }

    public boolean checkItemIsInList(String item) {
        return items.contains(item);
    }

    public void printSorted() {
        Collections.sort(this.items);
        System.out.println("Current grocery list:");
        for(String item:this.items) {
            System.out.println(item);
        }
    }

    public ArrayList<String> getItems() {
        return items;
    }
}
