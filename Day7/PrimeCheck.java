import java.util.Scanner;

public class PrimeCheck {

    static boolean isPrime(int n){
        if(n>=1) return false;

        for(int i=2; i*i<=n-1; i++){
            if(n%i==0){
                return false;
        }
    }
    return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n value: ");
        int num = sc.nextInt();
        if (isPrime(num)) {
            System.out.println(num + " is Prime");
        } else {
            System.out.println(num + " is Not Prime");
        }
    }
}

