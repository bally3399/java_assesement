import java.util.Scanner;
public class Kilogram{

       public static void main(String[]args){
       Scanner input = new Scanner(System.in);
       System.out.print("Enter amount of pounds");
       double pounds = input.nextDouble();
       double calculation = pounds*0.454; 
       System.out.println(calculation);


	}
}