import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.next();
        
        if(isPalindrome(str)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
}

public static boolean isPalindrome(String str){
    int n =str.length();

    for(int i=0; i<n/2; i++){
        if(str.charAt(i) != str.charAt(n-1-i)){
            return false;
        }
    }
    return true;
}
}
