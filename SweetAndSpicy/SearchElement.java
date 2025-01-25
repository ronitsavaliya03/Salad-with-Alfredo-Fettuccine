// WAP to check weather number is present in array or not (using recursion only) and the
// function’s syntax is given below
// Int isInArray(int a[],int m);
// Where int a[] is Array of integer and m is element to be searched. 

import java.util.Scanner;

public class SearchElement {
    public int isInArray(int a[],int m){
        return isInArrayHelper(a, m, 0);
    }

    public int isInArrayHelper(int a[],int m, int i){
        if(i==a.length){
            return 0;
        }

        // instead of return index here we can also return 1 as Found(as a question requirement)
        if(a[i]==m){
            return i; // First index of element occure
        }

        return isInArrayHelper(a, m, i+1);
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int n=sc.nextInt();
        int[] array=new int[n];

        for(int i=0; i<n; i++){
            System.out.print("Enter the elemant: ");
            array[i]=sc.nextInt();
        }

        System.out.print("Enter the element to be searched: ");
        int m=sc.nextInt();

        SearchElement element= new SearchElement();
        int index=element.isInArray(array, m);

        System.out.println(index);
        sc.close();
    }
}
