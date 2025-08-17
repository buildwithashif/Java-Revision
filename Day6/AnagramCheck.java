import java.util.*;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine().toLowerCase();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine().toLowerCase();

        if(isAnagram(str1, str2)) {
            System.out.println("Both strings are Anagrams.");
        } else {
            System.out.println("Both strings are NOT Anagrams.");
        }
    }

    public static boolean isAnagram(String str1, String str2) {
        if(str1.length() != str2.length()) return false;

        // Convert to mutable form
        StringBuilder sb = new StringBuilder(str2);

        for(int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);

            int index = sb.indexOf(String.valueOf(c));
            if(index != -1) {
                sb.deleteCharAt(index); // remove that char
            } else {
                return false; // char not found
            }
        }

        return sb.length() == 0; // all chars matched
    }
}
