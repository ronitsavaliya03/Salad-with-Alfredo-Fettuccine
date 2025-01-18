// WAP to find a power a^b (without using power and multiplication operation). 

import java.util.Scanner;

public class FindThePower {
    public int add(int x, int y){
        while (y!=0) {
            int carry=x&y;
            x=x^y;
            y=carry<<1;

            // System.out.println("carry: "+carry+" x: "+x+" y: "+y);
        }

        return x;
    }

    public int multiply(int x, int y){
        int result=0;
        boolean isNegative=false;

        if (x<0 && y>0 || x>0 && y<0) {
            isNegative = true;
        }

        x=Math.abs(x);
        y=Math.abs(y);

        for(int i=0; i<y; i++){
            result=add(result, x);
        }

        // System.out.println(result);
        return isNegative? -result: result;
    }

    public int power(int base, int power){
        if(power==0){
            return 1;
        }

        if(power<0){
            throw new IllegalArgumentException("This method doesn't support negative exponents.");
        }

        int result=1;
        for(int i=0; i<power; i++){
            result=multiply(result, base);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the base: ");
        int base=sc.nextInt();
        System.out.print("Enter the power: ");
        int power=sc.nextInt();

        FindThePower calc=new FindThePower();
        System.out.println(base+" ^ "+power+" = "+calc.power(base, power));

        sc.close();
    }
}
