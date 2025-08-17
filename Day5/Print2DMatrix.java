import java.util.Scanner;

public class Print2DMatrix {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        // System.out.print("Enter the no of rows: ");
        // int m = sc.nextInt();
        // System.out.print("Enter the no of columns: ");
        // int n = sc.nextInt();

        // int matrix[][] = new int[m][n];

        // for(int i=0; i<m; i++){
        //     for(int j=0; j<n; j++){
        //         System.out.print("Enter array element at index ["+ i +"]["+ j +"]: ");
        //         matrix[i][j] = sc.nextInt();
        //     }
        // }

        int[][]matrix =
        {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(matrix[i][j]+ " ");
                
            }
            System.out.println();
        }
}
}
