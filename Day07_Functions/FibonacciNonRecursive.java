import java.util.*;

public class FibonacciNonRecursive {

    static void Fibonacci(int n){
        int a = 0;
        int b = 1;

        if (n >= 1) System.out.print(a + " ");
        if (n >= 2) System.out.print(b + " ");

        for(int i=3; i<=n; i++){
            int c = a + b;
            System.out.print(c+ " ");
            a = b;
            b = c;
}
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter No: ");
        int n = sc.nextInt();

        Fibonacci(n);
}
}
