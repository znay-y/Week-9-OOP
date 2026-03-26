import java.util.Scanner;

/*
Write a program that:

1. Prompts the user to enter two integers.
2. Divides the first number by the second.

Your program must handle the following exceptions using separate catch blocks:

- ArithmeticException
- NumberFormatException

If an exception occurs, print an appropriate message.
*/

public class quest2 {

    public static void main(String[] args) {
        int first = numberIN("Enter the first number");
        int second = numberIN("Encter your second number");

        try {
            System.out.println(first / second);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide those numbers");
        }
    }

    public static int numberIN(String message) {
        Scanner kmb = new Scanner(System.in);
        System.out.println(message);
        String input = kmb.nextLine();

        try {
            int num = Integer.parseInt(input);
            return num;
        } catch (NumberFormatException e) {
            System.out.println("I SAIDDDDD enter a number");
            return 0;
        }

    }
}
