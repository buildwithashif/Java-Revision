import java.util.Scanner;

public class SumOfRow {
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

        //Sum of Row elements
        for(int i=0; i<m; i++){
            int sum = 0;
            for(int j=0; j<n; j++){
               sum = sum + matrix[i][j];

            }
            System.out.println("Sum of row"+i+"="+ sum);
        }

        // Calculate sum of all elements
        int totalSum = 0;
        for (int i = 0; i < m ; i++) {
            for (int j = 0; j < n; j++) {
                totalSum += matrix[i][j];
            }
        }
        System.out.println("Sum of all elements in the matrix = " + totalSum);
}
}
