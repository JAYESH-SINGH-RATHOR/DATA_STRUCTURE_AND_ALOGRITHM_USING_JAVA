public class subarrsum {
    public static int sum(int num[]){
        int sum = 0;
        int max_sum = Integer.MIN_VALUE;
      for(int i = 0; i < num.length; i++){
        int start = i;
        for(int j = 0; j < num.length; j++){
            int end = j;
             sum = 0;
            for(int k = start; k <= end; k++){
                // System.out.print(num[k]);
                sum += num[k];
            }
            System.out.println(" Sum of subarray from " + start + " to " + end + " is: " + sum);
            // int max_sum = Integer.MIN_VALUE;
            if(max_sum < sum){
                max_sum = sum;
            }
        } 
        System.out.println();
    }
    return 0;

    }
    public static void main(String[] args) {
        int num[] = {1, 2, 3, 4, 5};
        sum(num);
        // System.out.println("Sum of subarray from " + start + " to " + end + " is: " + sum);
    }
}
