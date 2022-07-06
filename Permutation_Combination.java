import java.util.Scanner;

public class Permutation_Combination {
    static int factorial(int num){
        int fact=1;
        for(int i=num;i>0;i--){
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values of n and r respectively : ");
        int n=sc.nextInt();
        int r=sc.nextInt();
        int permutation = (int)(factorial(n)/(factorial(n - r)));
        int combination = (int)(factorial(n)/(factorial(n - r) * factorial(r)));
        System.out.println("Permutation of "+n+" and "+r+" is : "+permutation);
        System.out.println("Combination of "+n+" and "+r+" is : "+combination);
    }
}
