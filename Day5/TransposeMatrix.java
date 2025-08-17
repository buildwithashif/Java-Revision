import java.util.Scanner;

public class TransposeMatrix {
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no of rows: ");
        int m = sc.nextInt();
        System.out.print("Enter the no of columns: ");
        int n = sc.nextInt();

        int matrix[][] = new int[m][n];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print("Enter array element at index ["+ i +"]["+ j +"]: ");
                matrix[i][j] = sc.nextInt();
}
        }
            //For transpose
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    System.out.print(matrix[j][i]+ " ");

                }
                System.out.println();

            }
        }
}
    
