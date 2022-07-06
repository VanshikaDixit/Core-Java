import java.util.Scanner;

public class Mirror_Inverse_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of an array : ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter "+n+" elements : ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int c=0;
        for(int i=0;i<n;i++){
            if(a[a[i]]!=i){
                c++;
                break;
            }
        }
        if(c>0){
            System.out.println("No! The entered array is not a mirror inverse.");
        }
        else{
            System.out.println("Yes! The entered array is  a mirror inverse.");
        }
    }
}
