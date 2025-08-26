 package question;

class duplicate {

    public static int duplicatee(int arr[]){
        if(arr.length == 0 || arr.length == 1){
            return arr.length;
        }
        int j = 0;
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] != arr[i + 1]){
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[arr.length - 1];
        return j;
        
    }
    public static void main(String[] args) {
        int arr[] = {1,1,2};
        int arr1[] = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(duplicatee(arr)); 
        System.out.println(duplicatee(arr1));   
    }
    
}