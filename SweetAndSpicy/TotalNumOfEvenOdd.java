// WAP to find a total odd and total even digit of a given number.

import java.util.Scanner;

public class TotalNumOfEvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        int totalOdd=0, totalEven=0;

        for(int i=n; i>0; i/=10){
            int temp=i%10;
            if(temp%2==0) totalEven++;
            else totalOdd++;
        }

        System.out.println("Total Even digits: "+totalEven);
        System.out.println("Total Odd digits: "+totalOdd);

        sc.close();
    }
}
