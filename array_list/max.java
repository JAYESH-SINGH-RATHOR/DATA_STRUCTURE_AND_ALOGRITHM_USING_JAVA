import java.util.ArrayList;

public class max {
    public static void main(String[] args) {
        int maxi = Integer.MIN_VALUE;
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        for(int i = 0; i < list.size(); i++){
           if(maxi < list.get(i)){
            maxi = list.get(i);
           }
           else{
             maxi = list.get(i);
           }
        }
            System.out.println( "maximum element is = " + maxi);
    }
}
