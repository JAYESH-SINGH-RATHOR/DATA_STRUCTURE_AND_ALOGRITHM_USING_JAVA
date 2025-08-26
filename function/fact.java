package function;
import java.util.Scanner;
public class fact {
    public static int FACTORIAL(){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int factt = 1;
        for(int i = 1; i <= num; i++){
            factt = factt*i;
            System.out.println(factt);
        }
        return factt;

    }
    public static void main(String[] args) {
       System.out.println( FACTORIAL());
        // System.out.println("Factorial is: = " + res);
    }
}
