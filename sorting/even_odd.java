package sorting;

public class even_odd {
    public static void main(String[] args) {
        int[] arr = {12, 34, 45, 9, 8, 90, 3};
        int n = arr.length;
        int[] temp = new int[n];
        int evenIndex = 0;
        int oddIndex = n - 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                temp[evenIndex++] = arr[i];
            } else {
                temp[oddIndex--] = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
      
    }

}
