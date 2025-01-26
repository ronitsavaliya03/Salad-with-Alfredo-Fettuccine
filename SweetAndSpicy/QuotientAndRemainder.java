// WAP to find a quotient and reminder of 2 number (bigger number should be divided by
// lower number) and you are not allowed to use a division and quotient operator.

import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the num1: ");
        int num1=sc.nextInt(); // larger number
        System.out.print("Enter the num2: ");
        int num2=sc.nextInt(); // smaller number

        if (num1 < num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        int quotient = 0;
        int remainder = num1;

        while (remainder >= num2) {
            remainder -= num2;
            quotient++;
        }

        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        sc.close();
    }
}
