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
                System.out.println("List products you want to add to the list separating with commas: ");
                String products = scanner.nextLine();
                groceryList.addItems(products);
                number = scanner.nextInt();
            } else if (number == 2) {
                System.out.println("List products you want to remove from the list separating with commas: ");
                String products = scanner.nextLine();
                groceryList.removeItems(products);
                number = scanner.nextInt();
            } else {
                System.out.println("Invalid number or character. Please enter 0, 1, or 2 only.");
                number = scanner.nextInt();
            }
            groceryList.printSorted();
        }
        while(number != 0);
    }
}