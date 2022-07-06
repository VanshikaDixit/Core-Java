import java.util.Scanner;

public class Transpose_of_Matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows and columns respectively : ");
        int rows=sc.nextInt();
        int columns=sc.nextInt();
        int a[][]=new int[rows][columns];
        System.out.println("Enter the elements : ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                a[i][j]=sc.nextInt();
            }
        }

        // Transpose Matrix...........
        int b[][]=new int[columns][rows];
        for(int i=0;i<columns;i++){
            for(int j=0;j<rows;j++){
                b[i][j]=a[j][i];
            }
        }
        System.out.println("Matrix after transpose will be : ");
        for(int i=0;i<columns;i++){
            for(int j=0;j<rows;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }
}
