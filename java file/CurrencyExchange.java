import java.util.Scanner;

public class CurrencyExchange{

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter Exchange rate from dollars to RMB: ");

	double exchangeRate = input.nextDouble();
	
	System.out.print("Enter 0 to convert dollars to chinese && 1 vice versa: ");  
	int converter =input.nextInt();

	if(converter == 0){
	System.out.print("Enter amount of dollars:");
	double dollars = input.nextDouble();
	double calculation = (exchangeRate * dollars);
	System.out.printf("$%.1f is %.1f yuan", dollars, calculation);
	}

	if(converter == 1){
	System.out.print("Enter amount of RMB: ");
	double RMB = input.nextDouble();
	double calculation1 = (RMB / exchangeRate);
	System.out.printf("$%.1f is %.1f yuan", RMB, calculation1);

	}



	}





}