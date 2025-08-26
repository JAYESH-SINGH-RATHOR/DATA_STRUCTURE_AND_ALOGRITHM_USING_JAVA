package arrays;

public class search {
    public static int linearsearch(int num[], int key){
        for(int i = 0 ; i < num.length; i++){
            if(num[i] == key){
                return i;
            }
            // else{
            //     for(int j = 0; j < num.length; j++){
            //         if(num[j] == key){
            //             return j;
            //         }
            //     }
            // }
        }
        return -1;
    }
    public static void main(String[] args) {
        int num [] = {10,20,30,40,50};
        int key = 20;
        int index = linearsearch(num, key);
        if(index == -1){
            System.out.println("Not Found");
        }
        else{
            System.out.println("Found at index " + index);
        }
    }
}
