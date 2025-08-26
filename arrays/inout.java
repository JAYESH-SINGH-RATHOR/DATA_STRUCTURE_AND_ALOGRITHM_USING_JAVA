package arrays;
import java.util.*;

public class inout {
    public static void main(String[] args) {
        int arr[] = new int[10];
        Scanner sc = new  Scanner(System.in);
        // System.out.println("Enter 10 numbers: =  ");
        // for(int i = 1; i <= arr.length; i++){
        //     System.out.println("Enter number " + i + ": ");
        //     arr[i-1] = sc.nextInt();
        // }
        System.out.println("enter the number of " + arr[0]);
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();
        System.out.println(arr[0]);
        System.out.println(arr[1]);  
        System.out.println(arr[2]);

    }
}
