import java.util.*;
public class SwapTwoNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Emter first no: ");
        int a = sc.nextInt();
        System.out.print("Emter second no: ");
        int b = sc.nextInt();

        //Swapping two numbers without third variable:
        //By XOR 
        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println("After Swapping:");
        System.out.println("First No: "+ a);
        System.out.println("Second No: "+ b);

        sc.close();
 }
}
