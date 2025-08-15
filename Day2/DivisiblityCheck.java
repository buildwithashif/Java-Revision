import java.util.*;
public class DivisiblityCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the num: ");
        int x = sc.nextInt();

        if(x%3==0 && x%5==0){
            System.out.println("Number is divisible");
        }else{
            System.out.println("Not divisible");
        }

        
    }
}
