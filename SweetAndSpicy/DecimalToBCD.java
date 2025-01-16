// WAP to convert a Decimal number to BCD. 

import java.util.Scanner;

public class DecimalToBCD {
    public String decimalToBCD(int decimal){
        StringBuilder bcd=new StringBuilder();

        while (decimal>0) {
            int digit=decimal%10;
            String binary=String.format("%4s", Integer.toBinaryString(digit)).replace(' ', '0');
            bcd.insert(0, binary+" ");
            decimal/=10;
        }

        return bcd.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the decimal: ");
        int decimal = sc.nextInt();

        DecimalToBCD convert=new DecimalToBCD();

        String bcd=convert.decimalToBCD(decimal);
        System.out.println("BCD representetion: "+bcd);

        sc.close();
    }
}
