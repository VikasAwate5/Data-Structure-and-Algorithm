package src.basic;

public class Palindrome {

    boolean isPalindrome(String text) {
        char[] c = text.toCharArray();

        int start = 0;
        int end = c.length - 1;

        while (start < end) {
            if (c[start] != c[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String text = "madam";

        Palindrome palindrome = new Palindrome();

        boolean result = palindrome.isPalindrome(text);

        if (result) {
            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is not Palindrome");
        }

    }
}
