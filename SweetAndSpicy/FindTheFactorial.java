// WAP to find a factorial of a given integer (iterative and recursive) 

import java.util.Scanner;

public class FindTheFactorial {
    public void iterative(int n){
        int fact=1;
        for(int i=1; i<=n; i++){
            fact*=i;
        }

        System.out.println(fact);
    }

    public int recursive(int n){
        if(n==1){
            return n;
        }

        return n*recursive(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();

        FindTheFactorial solution=new FindTheFactorial();
        solution.iterative(n);

        int ans=solution.recursive(n);
        System.out.println(ans);

        sc.close();
    }
}
