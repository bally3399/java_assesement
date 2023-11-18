import java.util.Scanner;

public class InvestmentValue{

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("investmentAmount");

	double investmentAmount = input.nextDouble();

	System.out.print("interestRate");

	double interestRate = input.nextDouble();

	System.out.print("numberOfYear");

	double numberOfYear = input.nextDouble();

	double futureInvestmentValue = investmentAmount * (1 + interestRate)

	System.out.printf("futureInvestmentvalue is %f%n", futureInvestmentValue);

}


} 