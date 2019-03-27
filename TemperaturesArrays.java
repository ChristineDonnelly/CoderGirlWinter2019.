package com.company;
import java.util.Scanner;
public class TemperaturesArrays {

    public static void main(String[] args) {

        System.out.println("Temerature Calculator");
        System.out.println();
        System.out.println("The data provided are:");

        int temps[][] = {{68, 70, 76, 70, 68, 71, 75},
                {76, 76, 87, 84, 82, 75, 83},
                {73, 72, 81, 78, 76, 73, 77},
                {64, 65, 69, 68, 70, 74, 72}};
        String days[] = {"Sun", "Mon", "Tues", "Wed", "Thurs", "Fri", "Sat"};
        String times[] = {"7 AM:", "3 PM:", "7 PM:", "3 AM:"};

        for (int row = 0; row < temps.length; row++) {
            int sum = 0;
            System.out.print(times[row] + " ");
            for (int column = 0; column < temps[row].length; column++) {
                sum += temps[row][column];
                System.out.print(temps[row][column] + " ");
            }
            System.out.println(sum / temps[row].length);
        }
        System.out.println();
        System.out.println("Based on that data, the following are the average temperatures for the week");
        System.out.println();


        for (int column = 0; column < days.length; column++) {
            System.out.print(days[column] + " ");
            int sum1 = 0;
            for (int row = 0; row < times.length; row++) {
                sum1 += temps[row][column];

            }
            System.out.println(" " + (sum1 / times.length));

        }
            System.out.println(" ");

        for (int row = 0; row < times.length; row++) {
            System.out.print(times[row] + " ");
            int sum2 = 0;
            for (int column = 0; column < days.length; column++) {
                sum2 += temps[row][column];
            }
            System.out.println(" " + sum2 / days.length);
        }
        System.out.println("");
        System.out.println("The final average temperature for the week was;");
        System.out.println("");

        int sum3 = 0;
        for (int column = 0; column < days.length; column++) {
            for (int row = 0; row < times.length; row++) {
                sum3 += temps[row][column];
            }
        }
        System.out.println("Overall:  " + sum3/(days.length * times.length));
    }

}

