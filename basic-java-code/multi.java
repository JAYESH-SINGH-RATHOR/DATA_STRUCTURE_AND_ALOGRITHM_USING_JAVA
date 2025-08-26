import java.util.*;
public class multi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("enter your number = : ");
            int num = sc.nextInt();
            if(num % 10 == 0){
                break;
            }
            System.out.println(num);
        }        
        while(true);
    }
}