import java.util.*;

public class Factorial{

    static int iterativeFactorial(int n) {
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact = fact * i;
        }
        return fact;

    }

    // static int factorial(int n){
    // if(n==0 || n==1){
    //     return 1;
    // }else{
    //     return n * factorial(n-1);
    // }
    // }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n value: ");
        int num = sc.nextInt();

        int result = iterativeFactorial(num);
        System.out.println("Factorial of "+ num + " is: "+ result);
    }

}


