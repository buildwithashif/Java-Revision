import java.util.*;
public class Bitwise {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

       System.out.print("Enter first No: ");
       int a = sc.nextInt();
       System.out.print("Enter second No: ");
       int b = sc.nextInt();

       System.out.println("a & b: "+ (a&b));
       System.out.println("a | b: "+ (a|b));
       System.out.println("a ^ b: "+ (a^b));
    }
}
