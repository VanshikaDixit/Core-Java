import java.util.*;

public class Remove_from_ArrayList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an arraylist : ");
        int n=sc.nextInt();
        ArrayList<Integer> arr =new ArrayList<Integer>(n);
        System.out.println("Enter "+n+" elements : ");
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        
        // To remove an element.....
        System.out.println("Enter which index element you want to remove : ");
        int index=sc.nextInt();
        arr.remove(index);
        System.out.println("After removing ArrayList will be : "+arr);
    }
    
}
