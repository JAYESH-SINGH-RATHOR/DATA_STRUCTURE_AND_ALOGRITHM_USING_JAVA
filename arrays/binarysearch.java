public class binarysearch{
    public static int binsearch(int num[] , int key){
        int left = 0; 
        int right = num.length - 1 ;
        while (left <= right) {
            int mid = (left + right) / 2;
            if(num[mid] == key){
                return mid;
            }
            if(num[mid] < key){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }

        }
        return -1;

    }
    public static void main(String[] args) {
        int num[] = {2,4,6,8,10,11,14};
        int key = 10;
        System.out.println(binsearch(num, key));
    }
}