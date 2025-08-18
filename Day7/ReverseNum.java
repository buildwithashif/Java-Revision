import java.util.Scanner;

public class ReverseNum {
    static int reversedNum(int n){
        int rev = 0;
        while(n != 0){
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n/10;
        }
        return rev;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter No: ");
        int n = sc.nextInt();

        int result = reversedNum(n);

        System.out.println("Reversed No: "+ result);
}
}