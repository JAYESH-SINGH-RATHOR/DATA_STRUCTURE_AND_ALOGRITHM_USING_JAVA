package question;

public class mountain {
    public static boolean validMountainArray(int[] arr) {
        if (arr.length < 3) return false;

        int i = 0;
        while (i < arr.length - 1 && arr[i] < arr[i + 1]) {
            i++;
        }

        if (i == 0 || i == arr.length - 1) return false;

        while (i < arr.length - 1 && arr[i] > arr[i + 1]) {
            i++;
        }

        return i == arr.length - 1;
    }
    public static void main(String[] args) {
        int[] arr1 = {2, 1};
        int[] arr2 = {3, 5, 5};
        int[] arr3 = {0, 3, 2, 1};
        int[] arr4 = {0, 1, 2, 3, 4, 5};

        System.out.println(validMountainArray(arr1));
        System.out.println(validMountainArray(arr2)); 
        System.out.println(validMountainArray(arr3)); 
        System.out.println(validMountainArray(arr4)); 
    }
}
