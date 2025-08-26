package sorting;

public class selection {
    public static void selectionsort(int arr[]){
        for(int i = 0; i < arr.length - 1; i++){
            int currelement = i ;
            for(int j = i + 1; i < arr.length; j++){
                if(arr[currelement] > arr[j]){
                    currelement = j;
                }

            }
            int temp = arr[currelement];
            arr[currelement] = arr[i];
            arr[i] = temp;
        }
    }
    public static void printarr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {64, 25, 12, 22, 11};
        selectionsort(arr);
        printarr(arr);
    }
}
