import java.io.StreamCorruptedException;

public class StringUtil {

    public boolean isPalindrome(String word) {
        char[] charArray = word.toCharArray();
        int start = 0;
        int end = charArray.length - 1;

        while (start < end) {
            if (charArray[start] != charArray[end]) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {
        StringUtil stringUtil = new StringUtil();
        String palindrome = "madam";
        String notPalindrome = "vegas";

        // is Palindrome
        System.out.println(stringUtil.isPalindrome(palindrome));
        System.out.println(stringUtil.isPalindrome(notPalindrome));

        
    }
}
