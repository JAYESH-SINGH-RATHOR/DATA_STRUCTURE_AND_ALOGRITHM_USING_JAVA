package arrys2d;

import java.util.Scanner;

public class search {
    public static void Matsearch(int matrix[][], int key){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < matrix.length; i++){
            for(int j=0; j < matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.println("Element found at index: " +"(" + i + " , " + j + ")");
                    // return true;
                }

            }
        }
        
            System.out.println("Element not found in the matrix.");
            // return false;
        
    }
    public static void main(String[] args) {
        int matrix[][] = new int [3][3];
        int n = matrix.length;
        int m = matrix[0].length;
        System.out.println("Enter the elements of the martix: ");
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        // print an array
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Enter the element to be searched: ");
        int key = sc.nextInt();
        Matsearch(matrix, key);
    }
}
