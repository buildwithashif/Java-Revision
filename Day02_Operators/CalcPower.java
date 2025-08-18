import java.util.*;
public class CalcPower {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an base: ");
        int a = sc.nextInt();

        System.out.print("Enter an exponential: ");
        int b = sc.nextInt();

       double result = 1;
       if(b>0){
        for(int i = 1; i<=b; i++){
            result *= a;
        }
       }else if(b<0){
        for(int i = 1; i <= -b; i++){
            result *= a;
        }
        result = 1 / result;
       }else{
        result = 1;
       }

       System.out.println(a + "^" + b + " = " + result);
       sc.close();
    }
}
