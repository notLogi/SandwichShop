package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        double price;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Regular(1) or large(2)?");
        int option = myScanner.nextInt();
        if(option == 1){
            price = 5.45;
        }
        else if(option == 2){
            price = 8.95;
        }
        else{
            System.out.println("Invalid option");
            return;
        }
        System.out.println("Enter your age: ");
        int age = myScanner.nextInt();
        double discount = 0;
        if(age <= 17){
            discount = 0.10;
        }
        else if(age >= 65){
            discount = 0.20;
        }
        double costOfSandwich = price - (price * discount);
        System.out.printf("Your total cost is: $%.2f", costOfSandwich);

        myScanner.close();
    }
}
