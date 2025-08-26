package function;

public class dectobin{
    public static void dectobin(int dec){
        int pow = 0;
        int reminder = 0;
        int binnum = 0;
        int mynum = dec;
        while(dec > 0){
            reminder = dec % 2;
            binnum = binnum + (reminder * (int)Math.pow(10,pow));
            pow++;
            dec /= 2;
        }
        System.out.println("binary number is " + mynum + " = " + binnum);
    }
    public static void main(String[] args) {
        dectobin(10);
    }
}