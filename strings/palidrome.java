public class palidrome {
    public static boolean pali(String str){
        for(int i = 0; i < str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                System.out.println("String is not palindrome");
                return false;
            } 
            }
            System.out.println("String is paldrome ");
            return true;
        }
    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(pali(str));
        
    }
}
