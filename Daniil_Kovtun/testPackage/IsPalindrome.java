package testPackage;

import java.util.Locale;

public class IsPalindrome {
    public static boolean isPalindrome(String text) {
        text = text.replaceAll("[^\\da-zA-Z]", "");
        text = text.toLowerCase();
        System.out.println(text);
        char[] dst=new char[text.length()];
        text.getChars(0, text.length(), dst, 0);
        int count = 0;
        for (int i = 0; i <= (text.length() / 2 - 1); i++) {
            if (dst[i] == dst[text.length() - 1 - i] ) {
                count++;
            }
        }
        if (count == text.length() / 2) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        String text = "Was it a cat I saw?";
        System.out.println(isPalindrome(text));
    }
}

