package function;

public class Palindrome {
    public static void pali(int n) {
        int original = n;
        int reversed = 0;

        while (n > 0) {
            int last_digit = n % 10;
            reversed = reversed * 10 + last_digit;
            n /= 10;
        }

        if (original == reversed) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }

    public static void main(String[] args) {
        pali(121); // Example test
    }
}
