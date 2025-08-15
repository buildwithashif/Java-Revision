import java.util.Scanner;

public class CountUptoN {
            public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int N = sc.nextInt();

        System.out.println("The numbers from 1 to N are: ");
        for(int i=1; i<N; i++){
            System.out.print(i+ "  ");
        }
}
}
