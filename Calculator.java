import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int n1=sc.nextInt();
         int n2=sc.nextInt();
         System.out.println("Enter 1 or 2 or 3 or 4 for add , sub , mul , div respectively : ");
         int operation=sc.nextInt();
         System.out.println("\nResult is : ");
         switch(operation){
            case 1 :
            System.out.println(n1+n2);
            break;
            case 2 : 
            System.out.println(Math.abs(n1-n2));
            break;
            case 3 :
            System.out.println(n1*n2);
            break;
            case 4 :
            System.out.println(((float)(n1)/n2));
            break;
            default :
            System.out.println("The entered operation is invalid.");
            
         }   

        
    }
}
