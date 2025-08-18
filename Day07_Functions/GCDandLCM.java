import java.util.Scanner;

public class GCDandLCM {

    static int gcd(int a, int b){
        if(b == 0)
            return a;
            return gcd(b, a % b);
        
    }
    static int lcm(int a, int b){
        return (a*b)/ gcd(a,b);
    }
            public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first value: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second value: ");
        int num2 = sc.nextInt();

        int gcdResult = gcd(num1,num2);
        int lcmResult = lcm(num1, num2);

        System.out.println("GCD: " + gcdResult);
        System.out.println("LCM: " + lcmResult);

}
}
