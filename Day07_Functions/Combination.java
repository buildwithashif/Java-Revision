import java.util.Scanner;

public class Combination {

    static int factorial(int n){
        int fact =1;
        for(int i=1; i<=n; i++){
         fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first value: ");
        int n = sc.nextInt();
        System.out.print("Enter second value: ");
        int r = sc.nextInt();

        int nMinusR = n - r;



        int nCr = factorial(n)/(factorial(nMinusR)*factorial(r));
        System.out.println("Total combinations possible are: " + nCr);
}
}
