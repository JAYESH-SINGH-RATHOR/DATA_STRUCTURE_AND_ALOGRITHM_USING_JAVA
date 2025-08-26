package question;

public class rme {
    public static int removeelement(int arr[], int val) {
       for(int i = 0; i < arr.length; i++) {
            if(arr[i] == val) {
                arr[i] = Integer.MAX_VALUE; // Mark the element to be removed
            }
        }
        int j = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != Integer.MAX_VALUE) {
                arr[j++] = arr[i];
            }
        }
        return j; 
    }
    
    public static void main(String[] args) {
        int arr[] = {3,2,2,3};
        int arr1[] = {0, 1, 2, 2, 3, 0, 4, 2};
        System.out.println(removeelement(arr, 3));
        System.out.println(removeelement(arr1, 2)); 
    }
}
