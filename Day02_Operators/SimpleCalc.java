import java.util.*;
public class SimpleCalc {
    public static void main(String[] args){ 
     Scanner sc = new Scanner(System.in);

           System.out.print("Enter first No: ");
       double a = sc.nextDouble();
       System.out.print("Enter second No: ");
       double b = sc.nextDouble();

       System.out.print("Choose operator(+,-,*,/,%): ");
       char op = sc.next().charAt(0);

       switch(op){
        case '+': System.out.println("Result: "+ (a+b));
        break;
        case '-': System.out.println("Result: "+ (a-b));
        break;
        case '*': System.out.println("Result: "+ (a*b));
        break;
        case '/': 
        if(b != 0){  
        System.out.println("Result: "+ (a/b));
}else{
    System.out.println("Division Error: zero found");
}
break;
case '%': 
if(b != 0){ 
System.out.println("Result: " + (a%b));
    }else{
        System.out.println("Error: Division by zero!");
    }
    break;
    default: 
    System.out.println("Invalid operator");
}
sc.close();
}
}
