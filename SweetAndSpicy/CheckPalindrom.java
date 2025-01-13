// WAP to find whether string is palindrome or not. 

import java.util.Scanner;

public class CheckPalindrom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str=sc.nextLine();
        boolean isPalindrom=true;
        char []array=str.toCharArray();

        for(int i=0; i<array.length/2; i++){
            if(array[i]!=array[str.length()-1-i]){
                isPalindrom=false;
            }
        }

        if(isPalindrom){
            System.out.println("String is Palindrom");
        }
        else{
            System.out.println("String is not Palindrom");
        }

        sc.close();
    }
}
