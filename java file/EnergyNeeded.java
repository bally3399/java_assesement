import java.util.Scanner;

public class EnergyNeeded{

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("waterInKilogram");

	double waterInKilogram = input.nextDouble();

	System.out.print("initialTemperature");

	double initialTemperature = input.nextDouble();

	System.out.print("finalTemparature");

	double finalTemperature = input.nextDouble();

	double energyNeeded = waterInKilogram * (finalTemperature - initialTemperature) * 4184;

	System.out.printf("eneryNeeded is %s%n", energyNeeded);
}




}