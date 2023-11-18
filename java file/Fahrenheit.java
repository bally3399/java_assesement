import java.util.Scanner;

public class Fahrenheit{

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter a num");

	double num  = input.nextDouble();

	double fahrenheit = (1.8 * num + 32);

	System.out.printf("fahrenheit is %f%n", fahrenheit);

	


	 }




}