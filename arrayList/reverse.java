package arrayList;
import java.util.*;
public class reverse {
    public static void reversee(int nums[]) {
        ArrayList<Integer> res = new ArrayList<>();
          for(int  i = res.size() - 1; i >= 0; i--){
            System.out.println(res.get(i));
          }

    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        reversee(nums);
    }
}
