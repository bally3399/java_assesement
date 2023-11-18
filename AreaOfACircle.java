import java.util.Scanner;

public class AreaOfACircle{

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("radius of a circle");

	double radiusOfACircle = input.nextDouble();

	double diameter = (2 * radiusOfACircle);

	System.out.printf("diameter is %f%n", diameter);

	double circumferenceOfACircle = 2 * (3.14159 * radiusOfACircle);
	
	System.out.printf("circumferenceOfACircle is %f%n", circumferenceOfACircle);

	double areaOfACircle = (3.14159 * radiusOfACircle);

	System.out.printf("areaOfACircle is %f%n", areaOfACircle);

	


	}





}