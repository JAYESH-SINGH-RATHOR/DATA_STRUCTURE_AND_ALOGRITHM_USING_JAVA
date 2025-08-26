package function;
public class bincof {
    public static int fact(int n){
        int fact = 1;
        for(int i =1; i<= n; i++){
            fact = fact * i;
        }
        return fact;
    }
    public static int bincoff(int n, int r){
       int fact_n = fact(n);
       int fact_r = fact(r);
       int fact_nmr = fact(n-r);
       int bincof = fact_n / (fact_r * fact_nmr);
       return bincof;
    }
    public static void main(String[] args) {
        System.out.println(bincoff(4,2));
    }
}