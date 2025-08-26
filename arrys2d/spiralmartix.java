package arrays2d;

import java.util.Scanner;

public class spiralmartix {
    public static void spiral(int matrix[][]){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < matrix.length; i++){
            for(int  j = 0; j < matrix.length;j++){
                if(i ==0 || j == 0 || i == matrix.length - 1 || j == matrix.length - 1){
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
    }
    public static void main(String[] args) {
        int matrix[][ ] =new int [4][4];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the matrix: ");
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
               matrix[i][j] = sc.nextInt(); 
            }
        }
    }
    public static void printarr(int matrix[][]){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        spiral(matrix);
        printarr(matrix);
    }

    
}
