import java.util.ArrayList;

public class swap {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        for(int i = 0; i < list.size(); i++){
            int temp = list.get(i);
            list.get(i) = list.get(i + 1);
            list.get( + 1) = temp;

        }
    }
}
