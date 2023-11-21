import java.util.Scanner;

public class Multiple2{

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter number");

	int num = input.nextInt();
	int division = (num % 3);

	if(num % 3==0)

	System.out.printf("division is %d%n", division);
	
	if(num % 3!=0)

	System.out.printf("division is not %d%n", division); 

	


	
	}



}