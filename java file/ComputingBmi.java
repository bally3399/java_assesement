import java.util.Scanner;

public class ComputingBmi{
 
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter amount of pounds");

	double pounds = input.nextDouble();

	System.out.print("Enter inches");

	double inches = input.nextDouble();

	double calculation = (pounds*0.45359237);

	double calculation1 = (inches*0.0254);

	double computingBmi = calculation / (calculation1 * calculation1);

	System.out.printf("computingBmi is %f%n", computingBmi);



}





}