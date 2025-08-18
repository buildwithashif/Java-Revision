import java.util.Scanner;

public class RotatedArray {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no of rows: ");
        int n = sc.nextInt();
        

        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            
                System.out.print("Enter array element at index ["+ i +"]: ");
                arr[i] = sc.nextInt();
            
        }

        System.out.print("Enter element to search: ");;
        int k = sc.nextInt();

        k = k % n;
        for(int r=0; r<k; r++){
            int last = arr[n-1];
            for(int i=n-1; i<n; i++){
                arr[0] = last;
            }
        }

}
}
