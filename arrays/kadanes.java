public class kadanes {
    public static void kad(int num[]) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        
        for (int i = 0; i < num.length; i++) {
            currsum = currsum + num[i];
            if (currsum < 0) {
                currsum = 0;
            }
            maxsum = Math.max(currsum, maxsum);
        }
        
        System.out.println("Sum of the maximum subarray is: " + maxsum);
    }

    public static void main(String[] args) {
        int num[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        kad(num);
    }
}
