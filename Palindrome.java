import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String reverse="";
        for(int i=s.length()-1;i>=0;i--){
            reverse+=s.charAt(i);
        }
        if(s.equals(reverse)){
            System.out.println(s+" is a palindrome string.");
        }
        else{
            System.out.println(s+" is not a palindrome string.");
        }
    }
    
}
