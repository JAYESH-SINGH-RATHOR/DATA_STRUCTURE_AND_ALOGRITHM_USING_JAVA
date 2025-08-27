package arrayList;

import java.util.*;

public class maxmum {

    public static void maximum(int nums[]){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            list.add(nums[i]);
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) > max){
                max = list.get(i);
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int nums[] = {1,3,5,7,9};
        maximum(nums);
    }
}