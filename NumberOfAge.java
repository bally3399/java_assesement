import java.util.Scanner;

public class NumberOfAge{

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number");
	
	int num = input.nextInt();

	int numberOfAge = (num * 365);
	
	System.out.printf("numberOfAge is %d%n", numberOfAge);



	}




}