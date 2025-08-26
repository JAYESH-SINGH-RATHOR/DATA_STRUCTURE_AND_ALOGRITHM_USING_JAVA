package arrays;
import java.util.*;

public class input {
    public static void main(String[] args) {
        int arr[] = new int[100];
        Scanner sc =  new Scanner(System.in);
        // int phy = sc.nextInt();
        // for(int i = 0; i <= arr.length; i++){
        //     System.out.print("enter a number " + i + " : ");
        //      arr[i - 1] = sc.nextInt();

        // }
        System.out.println("enter your numbers : ");
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();
        arr[3] = sc.nextInt();
        System.out.println("marks of math is = : " + arr[0]);
        System.out.println("marks of python is = : " + arr[1]);
        System.out.println("marks of chemistry is = : " + arr[2]);
        System.out.println("marks of physics is = : " + arr[3]);
        float avg = (arr[0] + arr[1] + arr[2] + arr[3]) / 4;
        System.out.println("average of the student or user = : " + avg);
    }
}
