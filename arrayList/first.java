package arrayList;
import java.util.*;
class first {
    public static void arraylist(int nums[]){
       ArrayList<Integer> list = new ArrayList<>();
       for(int i = 0; i < nums.length; i++){
        System.out.println(list.add(nums[i]));
       }
       System.out.println("inserted element is = " + list);

    //    to get an element
        // for(int i = 0; i <nums.length; i++){
        //     list.get(i);
        // }
        // System.out.println("elements are stored at = " + list);

        // to remove the element from the list 
        // for(int i = 0; i < nums.length ; i++){
        //     list.remove(Integer.valueOf(i));
        // }
        // System.out.println("removed elements are " + list);

            // to set an element at index values 
            for(int i = 0; i <nums.length; i++){
                list.set(i ,i + 3);
            }
            System.out.println("update value is " + list);

    }    

    public static void main(String[] args) {
        int nums[] = {2,3,4};
        arraylist(nums);
    }
}