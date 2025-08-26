package arrays;

public class returnn {
    public static int search_linear(int marks[] , int key){
        for(int i = 0 ; i < marks.length; i++){

            if(marks[i] == key){
                return i;
            }
            
        }
        return -1;
    }

    // public static String liner_search(int menu[] , int keyss){
    //     for(int i = 0; i < menu.length; i++){
    //         if(menu[i] == keyss){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }
    public static void main(String[] args) {
        int marks[] = {10,20,30,40,50,60,70,80,90,100};
        int key = 90;
        int index = search_linear(marks, key);
        if(index == -1){
            System.out.println("key noy found ");
        }
        else{
            System.out.println("key at location of : = : " + index);
        }
    //     String menu[] = {"samosa" , "kachodi" , "dosha" , "itali" ,"burger" , " rice"};
    //     String val = "burger";
    //    liner_search(menu, keyss);
    }
    
}
