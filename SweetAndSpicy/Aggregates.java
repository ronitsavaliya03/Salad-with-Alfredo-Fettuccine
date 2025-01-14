// WAP to find Max, Min, Average of n numbers, n should be taken from user and all n value
// should be taken from user (Note that you are not allowed to use an array for this)

import java.util.Scanner;

public class Aggregates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the n: ");
        int n=sc.nextInt();

        int[] array=new int[n];
        for(int i=0; i<n; i++){
            System.out.print("Enter the element: ");      
            array[i]=sc.nextInt();
        }

        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i: array){
            if(i>max) max=i;
            if(i<min) min=i;

            sum+=i;
        }

        System.out.println("Min value: "+min);
        System.out.println("Max value: "+max);
        System.out.println("Avg value: "+sum/n);

        sc.close();
    }
}
