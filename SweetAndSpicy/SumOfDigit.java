// WAP to find a summation of a digit of a given number. (Iterative and recursive)

import java.util.Scanner;

public class SumOfDigit {
    int sum=0;
    public void iterative(int n){
        for(int i=n; i>0; i/=10){
            int temp=i%10;
            sum+=temp;
        }
        System.out.println(sum);
    }

    public int recursive(int n){
        if(n>0){
            return sum;
        }

        int temp=n%10;
        sum+=temp;

        return recursive(n/10);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();

        SumOfDigit solution=new SumOfDigit();
        solution.iterative(n);

        int ans=solution.recursive(n);
        System.out.println(ans);
        sc.close();
    }
}
