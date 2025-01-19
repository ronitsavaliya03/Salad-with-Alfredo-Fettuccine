// WAP to find Max, Min, Average of n numbers, n should be taken from user and all n value
// should be taken from user (Note that you are not allowed to use an array for this)

import java.util.Scanner;

public class Aggregates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the n: ");
        int n=sc.nextInt();

        if (n <= 0) {
            System.out.println("The number of values must be greater than 0.");
            sc.close();
            return;
        }

        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=1; i<=n; i++){
            System.out.print("Enter the element: "); 
            int value=sc.nextInt();  

            if(value>max) max=value;
            if(value<min) min=value;

            sum+=value;   
        }

        System.out.println("Min value: "+min);
        System.out.println("Max value: "+max);
        System.out.println("Avg value: "+sum/n);

        sc.close();
    }
}
