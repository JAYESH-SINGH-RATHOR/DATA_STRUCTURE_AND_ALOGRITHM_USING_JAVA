public class reversenumber {
    public static void main(String[] args) {
        int num = 9936;
        int rev = 0;
        while( num > 0){
            int lastdigit = num % 10;
            rev = (rev * 10) + lastdigit ;
            num /= 10;
        }
        System.out.println(rev);
    }

}
