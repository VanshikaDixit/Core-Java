import java.util.Scanner;

public class Reverse_of_a_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string : ");
        String s=sc.nextLine();
        String reverse="";
        for(int i=s.length()-1;i>=0;i--){
            reverse+=s.charAt(i);
        }
        System.out.println("Reverse of "+s+" is : "+reverse);
    }
    
}
