// WAP to find a sum of even number into 1D array

import java.util.Scanner;

public class SumOfEvenNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size of array:");
        int n=sc.nextInt();
        int[] numbers=new int[n];
        
        int sum=0;

        for(int i=0; i<n; i++){
            System.out.print("Enter the"+i+"st/nd/th element: ");
            numbers[i]=sc.nextInt();
        }

        for(int i: numbers){
            if(i%2==0){
                sum+=i;
            }
        }

        System.out.println(sum);
        sc.close();
    }
    
}