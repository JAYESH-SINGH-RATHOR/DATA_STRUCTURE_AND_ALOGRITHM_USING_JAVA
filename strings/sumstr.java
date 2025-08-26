public class sumstr {
    public static String Sum_of_Largest_3_Prime_Substrings(String str) {
        int max1 = 0, max2 = 0, max3 = 0;
        StringBuilder currentNum = new StringBuilder();
        
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) {
                currentNum.append(c);
            } else {
                if (currentNum.length() > 0) {
                    int num = Integer.parseInt(currentNum.toString());
                    if (isPrime(num)) {
                        if (num > max1) {
                            max3 = max2;
                            max2 = max1;
                            max1 = num;
                        } else if (num > max2) {
                            max3 = max2;
                            max2 = num;
                        } else if (num > max3) {
                            max3 = num;
                        }
                    }
                    currentNum.setLength(0); 
                }
            }
        }

        if (currentNum.length() > 0) {
            int num = Integer.parseInt(currentNum.toString());
            if (isPrime(num)) {
                if (num > max1) {
                    max3 = max2;
                    max2 = max1;
                    max1 = num;
                } else if (num > max2) {
                    max3 = max2;
                    max2 = num;
                } else if (num > max3) {
                    max3 = num;
                }
            }
        }

        return String.valueOf(max1 + max2 + max3);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) 
        {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String input = "abc113xyz17mno7pqr5";
        System.out.println(Sum_of_Largest_3_Prime_Substrings(input));  
    }
}
