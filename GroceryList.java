
import static java.lang.System.out;
        import java.util.Scanner;

public class GroceryList
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        out.println("Please list three items on your grocery shopping list.");

        String item1;
        out.print("Item 1? ");
        item1 = keyboard.nextLine();
        out.println();
        String item2;
        out.print("Item 2? ");
        item2 = keyboard.nextLine();
        out.println();
        String item3;
        out.print("Item 3? ");
        item3 = keyboard.nextLine();
        out.println();
        out.println("Now, please enter the quantity of each item.");

        int number1;
        out.print("How many " + item1 + "? ");
        number1 = keyboard.nextInt();
        keyboard.skip("\n");
        out.println();
        int number2;
        out.print("How many " + item2 + "? ");
        number2 = keyboard.nextInt();
        keyboard.skip("\n");
        out.println();
        int number3;
        out.print("How many " + item3 + "? ");
        number3 = keyboard.nextInt();
        keyboard.skip("\n");
        out.println();
        out.println();
        out.println("Now, please enter the price of each item.");

        float price1;
        out.print("How much does one " + item1 + " cost? ");
        price1 = keyboard.nextFloat();
        keyboard.skip("\n");
        out.println();
        float price2;
        out.print("How much does one " + item2 + " cost?");
        price2 = keyboard.nextFloat();
        keyboard.skip("\n");
        out.println();
        float price3;
        out.print("How much does one " + item3 + " cost? ");
        price3 = keyboard.nextFloat();
        keyboard.skip("\n");
        out.println();
        float totalPrice;
        totalPrice = (number1 * price1) + (number2 * price2) + (number3 * price3);
        out.print("Calculating your grocery bill.\n");
        out.print("Your total cost is " + totalPrice +"");
    }
}
