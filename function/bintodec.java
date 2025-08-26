package function;

public class bintodec {
    public static void bintodecc(int binnum){
        int mynum = binnum;
        int pow = 0;
        int decnum = 0;
        while(binnum > 0){
            int lastdigit = binnum % 10;
            decnum = decnum + (lastdigit * (int)Math.pow(2,pow));
            pow++;
            binnum /= 10;
        }
        System.out.println("decimal number is " + mynum + " = " + decnum);
    }
    public static void main(String[] args) {
        bintodecc(101);
    }
}
