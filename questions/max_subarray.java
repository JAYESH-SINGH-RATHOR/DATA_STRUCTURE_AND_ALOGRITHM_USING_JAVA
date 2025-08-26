package questions;
import java.util.*;
public class max_subarray {

    public static void max_Subarray_Sum(int arr[]){
        int sum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i =0; i <arr.length; i++){
            sum = 0;
            for(int j = 0; j < arr.length; j++){
                sum += arr[j];
                if(maxsum < sum){
                    maxsum = sum;
                }
            }
        }
        System.out.println(maxsum);
    }
    public static void main(String[] args) {
        int arr[] = {1,-2 , 6  ,-1 , 3};
        max_Subarray_Sum(arr);
    }
}