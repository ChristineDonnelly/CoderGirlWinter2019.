package com.company;
        import static java.lang.System.out;
        import java.util.Scanner;


public class SandwichShop
{

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int goalForVeggies = 50;
        int goalForBurgers = 250;
        int goalForSubs = 180;
        int goalForSoup = 70;

        out.println("Checking sales goals.");

        out.println("The sales goal for Veggie sandwiches is " + goalForVeggies);

        out.print("How many veggie sandwiches were sold today?");
        int veggieSold = keyboard.nextInt();

        if (veggieSold >= goalForVeggies){
            out.println("Made goal for veggies.\n");
        } else{
            out.println("Fell short for veggies.\n");
        }

        out.println("The sales goal for burgers is " + goalForBurgers);

        out.print("How many burgers were sold today?");
        int burgerSold = keyboard.nextInt();

        if (burgerSold >= goalForBurgers) {
            out.println("Made goal for burgers.\n");
        } else{
            out.println("Fell short for burgers.\n");
        }

        out.println("The sales goal for subs is " + goalForSubs);

        out.print("How many subs were sold today?");
        int subSold = keyboard.nextInt();

        if (subSold >= goalForSubs) {
            out.println("Made goal for subs.\n");
        } else{
            out.println("Fell short for subs.\n");
        }

        out.println("The sales goal for soup is " + goalForSoup);

        out.print("How many soups were sold today?");
        int soupSold = keyboard.nextInt();

        if (soupSold >= goalForSoup) {
            out.println("Made goal for soup.\n");
        } else {
            out.println("Fell short for soup.\n");
        }
        if (veggieSold >= 50 && burgerSold >= 250 &&
                subSold >= 180 && soupSold >= 70) {
            out.print("Made goal for everything!");
        }


    }

}


