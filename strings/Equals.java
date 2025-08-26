public class Equals {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello");
        String str4 = new String("hello");

        // Using == operator
        System.out.println(str1 == str2); // true, because they point to the same string literal
        System.out.println(str1 == str3); // false, because str3 is a new object
        System.out.println(str3 == str4); // false, because they are different objects

        // Using equals() method
        System.out.println(str1.equals(str2)); // true, because the content is the same
        System.out.println(str1.equals(str3)); // true, because the content is the same
        System.out.println(str3.equals(str4)); // true, because the content is the same
    }
}
