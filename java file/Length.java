import java.util.Scanner;

public class Length{

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	
	System.out.print("speed");

	double speed = input.nextDouble();

	System.out.print("acceleration");
	
	double acceleration =input.nextDouble();

	double length =(speed * speed) / (2 * acceleration);

	System.out.printf("the length is %s%n", length);


	}





}