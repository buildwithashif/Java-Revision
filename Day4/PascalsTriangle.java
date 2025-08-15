import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);

       System.out.print("Enter No. of rows: ");
       int n = sc.nextInt();

       for(int i=0; i<n; i++){
        for(int s=0; s<n-i; s++){
            System.out.print(" ");
        }
        int num = 1;
        for(int j=0; j<=i; j++){
            System.out.printf("%4d",num);
            num = num * (i-j)/(j+1);
        }
        System.out.println();
       }
}
}
