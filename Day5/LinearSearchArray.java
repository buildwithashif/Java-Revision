import java.util.Scanner;

public class LinearSearchArray {
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

        System.out.print("Enter element to search: ");;
        int target = sc.nextInt();

        boolean found = false;


        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j] == target){
                    System.out.println("Target element found at index ["+i+"]["+j+"]");
                    found = true;
                    break;
                }
            }
            if(found) break;
        }
        if(!found){
            System.out.println("Target element NOT found!");
        }
}
}
