// WAP to convert a Binary to Decimal

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the binary number: ");
        int binary=sc.nextInt();

        int decimal=0, power=0;

        for(int i=Integer.toString(binary).length()-1; i>=0; i--){
            char bit=Integer.toString(binary).charAt(i);

            if(bit=='1'){
                decimal+=Math.pow(2, power);
            }
            else if(bit!='0'){
                System.out.println("Invalid number...");
                return;
            }

            power++;
        }
        
        // int decimal= Integer.parseInt(Integer.toString(binary),2);
        // and handle the NumberFormatException
        System.out.println("Decimal value of "+binary+" is "+decimal);
        
        sc.close();
    }
}
