import java.util.*;
public class GreatestInTwo {
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first No: ");
        int a = sc.nextInt();
        System.out.print("Enter the second No: ");
        int b = sc.nextInt();

        if(a>b){
                System.out.println("First is greatest");
        }else{
                System.out.println("Second is greatest");
        }
}
}
