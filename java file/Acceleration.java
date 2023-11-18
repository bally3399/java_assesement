import java.util.Scanner;

public class Acceleration{

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("startingVelocity");

	double startingVelocity = input.nextDouble();

	System.out.print("endingVelocity");

	double endingVelocity = input.nextDouble();

	System.out.print("time");

	double time = input.nextDouble();

	System.out.print("changeInVelocity");

	double changeInVelocity = endingVelocity - startingVelocity;

	double acceleration = changeInVelocity/time;

	System.out.printf("the acceleration is %3f", acceleration); 
	
	}


}