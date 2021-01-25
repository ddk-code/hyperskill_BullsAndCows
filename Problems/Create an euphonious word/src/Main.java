import java.util.*;

public class Main {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        int needToAdd = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (isVowel(s.charAt(i)) && isVowel(s.charAt(i + 1)) && isVowel(s.charAt(i + 2)) ||
            !isVowel(s.charAt(i)) && !isVowel(s.charAt(i + 1)) && !isVowel(s.charAt(i + 2))) {
                ++needToAdd;
                ++i;
            }
        }
        System.out.println(needToAdd);
    }

    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' ||
               c == 'o' || c == 'u' || c == 'y';
    }
}