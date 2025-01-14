// WAP to find a prime number between range (range should be entered by user)

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Starts With: ");
        int a=sc.nextInt();
        System.out.print("Ends With: ");
        int b=sc.nextInt();

        if(a>b){
            System.out.println("Starting number is always smaller then ends");
            int temp=a;
            a=b;
            b=temp;
            System.out.println("Start with: "+a+"\nEnds with: "+b);
        }

        boolean isPrime;
        for(int i=a; i<=b; i++){
            isPrime=true;

            for(int j=2; j<i/2; j++){
                if(i%j==0){
                    isPrime=false;
                }
            }   
            
            if(isPrime) System.out.print(i+" ");
        }
        
        sc.close();
    }
}
