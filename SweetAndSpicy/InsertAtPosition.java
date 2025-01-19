// WAP to enter an element at specific position into array. (Do not take a new array)

import java.util.Scanner;

public class InsertAtPosition {
    public int insertAt(int[] array,int n, int index, int elemant){
        if (index < 0 || index > n || n >= array.length) {
            System.out.println("Invalid position or array is full.");
            return n;
        }

        for(int i=n; i>index; i--){
            array[i]=array[i-1];
        }

        array[index]=elemant;
        return n++;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        InsertAtPosition insert=new InsertAtPosition();
        System.out.print("Enter the size of an array: ");
        int n=sc.nextInt();
        int[] array=new int[10];

        for(int i=0; i<n; i++){
            System.out.print("Enter the elemant: ");
            array[i]=sc.nextInt();
        }

        insert.insertAt(array,n, 2, 5);

        for(int i=0; i<n+1; i++){
            System.out.print(array[i]+" ");
        }
        sc.close();
    } 
}
