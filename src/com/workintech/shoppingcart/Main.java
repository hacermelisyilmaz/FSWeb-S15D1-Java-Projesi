package com.workintech.shoppingcart;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("0 for exit, 1 for adding products, 2 for removing products: ");
        int number = scanner.nextInt();

        GroceryList groceryList = new GroceryList();

        do {
            if (number == 1) {
                String products = scanner.next();
                groceryList = addItems(groceryList, products);
                number = scanner.nextInt();
            } else if (number == 2) {
                number = scanner.nextInt();
            } else {
                System.out.println("Invalid number or character. Please enter 0, 1, or 2 only.");
            }
        }
        while(number != 0);
    }
}