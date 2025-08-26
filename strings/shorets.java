public class shorets {
    public static String Shortest_Palindrome(String str) {
        int n = str.length();
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < n; i++) {
            sb.append(str.charAt(n - 1 - i));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "abc";
        String result = Shortest_Palindrome(str);
        System.out.println("The shortest palindrome is: " + result);
    }
}
