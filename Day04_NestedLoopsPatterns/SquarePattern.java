import java.util.*;
public class SquarePattern {
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);

       System.out.print("Length of Square: ");
       int n = sc.nextInt();
       //System.out.println("Length of Square: ");
       //int m = sc.nextInt();

       for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            System.out.print("* ");
        }
        System.out.println();
       }
    }
}

