public class subarr {
    public static int subarray(int num[]){
        for(int i = 0; i < num.length; i++){
            int start = num[i];
            for(int j = i; j < num.length; j++){
                int end = num[j];
                for(int k = start; k < end; k++){
                    System.out.print(num[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[] = {1,2,3,4,5,6};
        System.out.println(subarray(num));
    }
}
