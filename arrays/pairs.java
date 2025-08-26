public class pairs {
    public static int pairss(int num[]){
        for(int i = 0; i< num.length; i++){
            int curr = num[i];
            for(int j = i + 1; j < num.length; j++){
                System.out.print("( " + curr + " , " + num[j] + " )");
            }
            System.out.println();
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[] = {1,2,3,4,5,6};
        System.out.println(pairss(num));
    }
}
