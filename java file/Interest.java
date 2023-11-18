import java.util.Scanner;

public class Interest{

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("balance");

	double balance = input.nextDouble();

	System.out.print("annualInterest");

	double annualInterest =input.nextDouble();

	double interest = balance * (annualInterest / 1200);

	System.out.printf("the interest is %f%n", interest);


}





}