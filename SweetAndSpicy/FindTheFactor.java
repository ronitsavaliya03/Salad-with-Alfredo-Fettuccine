// WAP to find a Factor of a given number (iterative and recursive) 

import java.util.Scanner;

public class FindTheFactor {
    public void iterative(int n){
        for(int i=1; i<=n; i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }

    public void recursive(int n, int i){
        if(n<i){
            return;
        }
        if(n%i==0){
            System.out.print(i+" ");
        }
        recursive(n, i+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();

        FindTheFactor solution= new FindTheFactor();

        System.out.println("Factors of n: ");
        solution.iterative(n);
        System.out.println();
        solution.recursive(n, 1);

        sc.close();
    }
}
