import java.util.Scanner;

public class Diamond_Pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=(i*2)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=(i*2)-1;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
     }
}
