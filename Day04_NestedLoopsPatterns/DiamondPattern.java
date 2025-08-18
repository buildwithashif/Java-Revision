import java.util.Scanner;

public class DiamondPattern {
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);

       System.out.print("Enter No. of rows: ");
       int n = sc.nextInt();

       //Upper Half
       for(int i=1; i<=n; i++){
        //Spaces
        for(int j=i; j<n; j++){
            System.out.print(" ");
        }
        //Stars
        for(int j=1; j<=2*i-1; j++){
            System.out.print("*");
        }
        System.out.println();
       }

       //Lower Half
       for(int i=n-1; i>=1; i--){
        //Spaces
        for(int j=n; j>i; j--){
            System.out.print(" ");
        }
        for(int j=1; j<=2*i-1; j++){
            System.out.print("*");
        }
        System.out.println();
       }
}
}
