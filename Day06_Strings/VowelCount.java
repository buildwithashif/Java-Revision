import java.util.Scanner;

public class VowelCount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int n = str.length();

        int vowelCount = 0;
        int consonantCount = 0;
        for(int i=0; i<n-1; i++){
            char ch = str.charAt(i);
            
            // check if vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vowelCount++;
            }
            // check if consonant (only alphabets)
            else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                consonantCount++;
            }
      }
        System.out.println("No. of vowels: "+ vowelCount);
            System.out.println("No. of vowels: "+ consonantCount);
}
}
