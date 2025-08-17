import java.util.*;
public class ConcatenateString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        String str3 = str1.concat(str2);
        System.out.println("New combined string: "+ str3);
    }
}
