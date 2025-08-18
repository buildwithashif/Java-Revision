import java.util.Scanner;

public class MaxOfThree {

    static int maxOfThree(int a, int b, int c){
        int tempMax = (a > b) ? a : b;
        return (tempMax > c) ? tempMax : c;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first value: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second value: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third value: ");
        int num3 = sc.nextInt();

        int max = maxOfThree(num1, num2, num3);
        System.out.println("Maximum No: "+ max);
}
}
