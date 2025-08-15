import java.util.*;
public class LargestInThree {
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the num a: ");
        int a = sc.nextInt();
        System.out.print("Enter the num b: ");
        int b = sc.nextInt();
        System.out.print("Enter the num c: ");
        int c = sc.nextInt();

        int largest = (a>b)?((a>c)? a:c):((b>c)? b:c);
        System.out.println("Largest No: "+ largest);
}
}
