import java.util.*;
public class SquareNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the num: ");
        int x = sc.nextInt();

        int sq = x*x;
        System.out.println("Square: "+ sq);

        int cube = x*x*x;
        System.out.println("Cube: "+ cube);
    }
}