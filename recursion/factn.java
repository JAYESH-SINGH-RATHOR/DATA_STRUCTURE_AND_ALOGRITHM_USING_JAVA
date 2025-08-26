public class factn {
    public static int fact(int n){
        if(n == 0){
            return 1;
        }
        fact(n - 1);
        return n * fact(n - 1);
    }
    public static void main(String[] args) {
        int n = 10;
        fact(n);
        System.out.println("Factorial of " + n + " is: " + fact(n));
    }
}
