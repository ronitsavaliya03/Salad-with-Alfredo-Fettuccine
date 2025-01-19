// WAP to delete an element from array specified by user. if element is not found print a
// message “Element is not found” (do not take a new array).

import java.util.Scanner;

public class DeleteTheElement {
    public int delete(int[] array,int n, int elemant){
        int index=-1;

        for(int i=0; i<n; i++){
            if(array[i]==elemant){
                index=i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Element not found.");
            return n;
        } else {
            for (int i = index; i < n - 1; i++) {
                array[i] = array[i + 1];
            }
            return n-1;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        DeleteTheElement object=new DeleteTheElement();
        System.out.print("Enter the size of an array: ");
        int n=sc.nextInt();
        int[] array=new int[10];

        for(int i=0; i<n; i++){
            System.out.print("Enter the elemant: ");
            array[i]=sc.nextInt();
        }

        object.delete(array, n, 3);

        for(int i=0; i<n-1; i++){
            System.out.print(array[i]+" ");
        }

        sc.close();
    } 
}
