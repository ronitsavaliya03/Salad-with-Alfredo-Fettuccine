// WAP to find whether a number is Odd or Even without using a % operator

import java.util.Scanner;

public class EvenOddWithoutMod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();

        if ((n&1)==0) System.out.println(n+" is Even number");
        else System.out.println(n+" is Odd number"); 

        sc.close();
    }
}
