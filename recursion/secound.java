public class secound {
   
    public static void countt(int n){
        if(n == 1) {
            System.out.println(n);
            return;
        }
        countt(n - 1);
        System.out.println(n);
        
    }
    public static void main(String[] args) {
        int n = 5;
        countt(n);
    }
}
