import java.util.Scanner;

public class Cost{

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("driving distance");

	double drivingDistance = input.nextDouble();

	System.out.print("miles per gallon");

	double milesPerGallon = input.nextDouble();

	System.out.print("price per gallon");

	double pricePerGallon = input.nextDouble();

	double CostOfDriving = drivingDistance / milesPerGallon * pricePerGallon;

	System.out.printf("costOfDriving is %f%n", CostOfDriving);





}







}