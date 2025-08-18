import java.util.Scanner;

public class FirstNonRepeating {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        int n = str.length();

        for(int i=0; i<n; i++){
            char ch = str.charAt(i);
            int count = 0;
            for(int j=0; j<n; j++){
                if(str.charAt(j) == ch){
                    count++;
                }
            }
            if(count == 1){
                System.out.println("First non-repeating character is: "+ ch);
                return;
            }
        }
        System.out.println("No char found");
}
}
