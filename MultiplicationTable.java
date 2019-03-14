package com.company;
import java. util.Scanner;

public class MultiplicationTables {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to Multiplication Tables");
        System.out.println("");
        System.out.println("How large would you like to see them?");
        int size = keyboard.nextInt();


        for (int multiple1 = 0; multiple1<= size; multiple1++) {

            for (int multiple2 = 0; multiple2 <= size; multiple2++){

                System.out.println(multiple1 + "*" + multiple2 + "=" + (multiple1 * multiple2));
            }
        }

    }
}