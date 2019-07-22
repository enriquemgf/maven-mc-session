package com.mastercard;

public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.sum(2, 4);
        System.out.printf("Sum result: %d\n", c.getResult());

        try {
            c.sub(2, 4);
            System.out.printf("Sub result: %d", c.getResult());
        } catch (NullPointerException e){
            System.out.println("An error occurred while subtracting, please review the parameters.");
        }

    }
}
