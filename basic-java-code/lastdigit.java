public class lastdigit {
    public static void main(String[] args) {
        int number = 11022007;
        while( number > 0){
            long Lastdigit = number % 10;
            System.out.print(Lastdigit + " ");
            number /= 10; 
        }
    }
}
