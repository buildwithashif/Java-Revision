import java.util.Scanner;

public class InvertedHalfPyramid {
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter value: ");
    int n = sc.nextInt();

    //By using (n-i)
    for(int i=1; i<=n; i++){
        for(int j=1; j<=n-i; j++){
            System.out.print(j+ " ");
        }
          

        System.out.println();
    }
        //By reversing i index
        System.out.print("Enter value: ");
        int o = sc.nextInt();

        for(int i=o; i>=1; i--){
        for(int j=1; j<=i; j++){
            System.out.print(j+ " ");
        }

        System.out.println();
    }
}
}
