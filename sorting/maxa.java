package sorting;

public class maxa {
    public int maxsum_subarray(int[] arr) {
        int maxsum = arr[0];
        int end = arr[0];

        for (int i = 1; i < arr.length; i++) {
            end = Math.max(arr[i], end + arr[i]);
            maxsum = Math.max(maxsum, end);
        }

        return maxsum;
    }          
    public static void main(String[] args) {
        maxa obj = new maxa();
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = obj.maxsum_subarray(arr);
        System.out.println(result);
    }                                                                                                                                                     
    
}
