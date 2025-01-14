// WAP to find a Multiplication of 2 Matrix (dimension and value should be entered by user)

import java.util.Scanner;

public class MatrixMultiplication {
    Scanner sc=new Scanner(System.in);

    public int[][] matrix(int m, int n){
        int[][] matrix=new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print("Enter the element of matrix["+i+"]"+"["+j+"]: ");
                matrix[i][j]=sc.nextInt();
            }
        }
        return matrix;
    }

    public void display(int[][] matrix, int m, int n){
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public int[][] multiplication(int[][] matrix1, int[][] matrix2, int m, int n){
        int[][] matrix=new int[m][m];
        for(int i=0; i<m; i++){
            for(int j=0; j<m; j++){
                for(int k=0; k<n; k++){
                    matrix[i][j]+=matrix1[i][k]*matrix2[k][j];
                }
            }
        }

        return matrix;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        MatrixMultiplication object=new MatrixMultiplication();

        System.out.println("Enter matrix's dimensions");
        System.out.print("Enter m:");
        int m=sc.nextInt();
        System.out.print("Enter n:");
        int n=sc.nextInt();

        int[][] matrix1=object.matrix(m, n);
        object.display(matrix1, m, n);

        int[][] matrix2=object.matrix(n, m);
        object.display(matrix2, n, m);

        int[][] ans=object.multiplication(matrix1, matrix2, m, n);
        object.display(ans, m, m);

        sc.close();
    }
}
