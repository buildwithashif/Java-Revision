import java.util.Scanner;

public class ReverseArray {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.print("Enter the elements of array: ");
        for(int i=0; i<n; i++){
             arr[i] = sc.nextInt();
        }

        //Reverse Loop
        for(int i=0; i<n/2; i++){
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }

        System.out.print("Reversed Array: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }

}
}
