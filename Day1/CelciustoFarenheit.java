import java.util.*;
public class CelciustoFarenheit {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);

System.out.print("Enter temperature in Celcius: ");
double celcius = sc.nextDouble();

double farenheit =(celcius*9/5)+32;

System.out.println("Temperature in Farenheit: "+farenheit);
}
}
