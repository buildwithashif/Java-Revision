import java.util.*;
public class InvertedTrianglePattern {
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);

       System.out.print("Length of Square: ");
       int n = sc.nextInt();
       //System.out.println("Length of Square: ");
       //int m = sc.nextInt();

       for(int i=n; i>=1; i--){
        for(int j=1; j<i; j++){
            System.out.print(" ._. ");
        }
        System.out.println();
       }
    }
}


