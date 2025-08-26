import java.util.Scanner;

public class largest {
    public static int findLargest(int[][] mat) {
        int large = Integer.MIN_VALUE;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] > large) {
                    large = mat[i][j];
                }
            }
        }
        return large;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get matrix size
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] mat = new int[rows][cols];

        // Input matrix elements
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        // Display matrix
        System.out.println("Matrix is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        // Find and display largest element
        int largest = findLargest(mat);
        System.out.println("Largest element in matrix: " + largest);
        
    }
}
