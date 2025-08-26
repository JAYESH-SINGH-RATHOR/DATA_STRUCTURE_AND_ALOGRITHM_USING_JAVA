import java.util.*;
// public class javabasic {

//     public static void main(String[] args) {
//         System.out.println("hello world \n  welcome to world of java programming");
//     }
// }


// // public class pattern1 {

// //     public static void main(String[] args) {
// //         for(int i = 0; i < 100; i++){
// //             System.out.println(i + " hello world!");
// //         }
// //     }
// // }

// public class pattern1 {

//     public static void main(String[] args) {
//         int i = 0;
//         while(i < 100){
//             System.out.println(i);
//             i++;
//         }
//     }
// }

// public class javabasic{

//     public static void main(String[] args) {
//         int num = 1;
//         while(num <= 10){
//             System.out.println(num);
//             num++;
//         }
//     }
// }



// public class javabasic {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         int counter = 1;
//         while(counter <= num){
//             System.out.println(counter);
//             counter++;
//         }
//     }
// }


// public class javabasic {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num =  sc.nextInt();
//         int counter = 1;
//         int sum = 0;
//         while(counter <= num){
//            sum = sum + counter;
//            counter++;
//         }
//         System.out.print("sum is :" + sum);
//     }
// }

public class javabasic {

    public static void main(String[] args) {
        int n = 8012007;
        while(n > 0){
            long ld = n % 10;
            System.out.print(ld + " ");
            n/= 10;
        }
    }
}