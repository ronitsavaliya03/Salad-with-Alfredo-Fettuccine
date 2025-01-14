// WAP to find a Fibonacci series up to n terms (n is entered by user) (iterative and recursive)

import java.util.Scanner;

public class Fibonacci {
    int n1=1;
    int n2=1;
    int n3;
    boolean isFirstCall=true;
    public void iterative(int n){
        System.out.print(n1+" "+n2+" ");
        for(int i=0; i<n-2; i++){
            n3=n1+n2;
            System.out.print(n3+" ");
            n1=n2;
            n2=n3;
        }
    }

    public void recursive(int n){
        if(n-3<0){
            return;
        }
        if(isFirstCall){
            System.out.print(n1+" "+n2+" ");
            isFirstCall=false;
        }
        n3=n1+n2;
        System.out.print(n3+" ");
        n1=n2;
        n2=n3;
        recursive(n-1);
    }
    public static void main(String[] args) {
        Fibonacci solution=new Fibonacci();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of term you need: ");
        int n=sc.nextInt();

        // solution.iterative(n);
        solution.recursive(n);

        sc.close();
    }
}