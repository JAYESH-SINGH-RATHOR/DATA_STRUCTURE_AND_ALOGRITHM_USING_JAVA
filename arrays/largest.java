package arrays;
import java.util.*;
public class largest {
    public static int largenumber(int num[]){
        int large = Integer.MIN_VALUE; // -infinity
        for(int i = 0 ; i < num.length; i++){
            if(num[i] > large){
                large = num[i];
            }
            else{
                return num[i + 1];
            }
        }
        return large;
    }
    public static void main(String[] args) {
        int num[] = {10,20,30,40,50};
        int largest = largenumber(num);
        if(largest == -1){
            System.out.println("Not Found");
        }
        else{
            System.out.println("Largest number is " + largest);
        }
    }
}
