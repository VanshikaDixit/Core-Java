import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long num=sc.nextLong();
        long f=1;
        for(long i=num;i>0;i--){
            f*=i;
        }
        System.out.println("Factorial of "+num+" is : "+f);
    }
    
}
