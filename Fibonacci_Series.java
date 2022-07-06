import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int f1=0,f2=1,f3=0;
        System.out.println("The series will be : ");
         System.out.print(f1+" "+f2+" ");   
        for(int i=3;i<=n;i++){
            f3=f1+f2;
            f1=f2;
            f2=f3;
          System.out.print(f3+" ");     
        }
    }
}
