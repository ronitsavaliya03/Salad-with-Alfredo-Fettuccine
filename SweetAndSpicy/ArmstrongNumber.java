// WAP to find weather given number is Armstrong number is not.

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();

        int temp;
        int sum=0;
        for(int i=n; i>0; i/=10){
            temp=i%10;
            sum+=Math.pow(temp, String.valueOf(n).length());
        }

        if(n==sum) System.out.println(n+" is Armstrong number");
        else System.out.println(n+" is not Armstrong number");

        sc.close();
    }
}
