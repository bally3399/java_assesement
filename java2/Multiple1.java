import java.util.Scanner;

public class Multiple1{

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter firstNumber");

	int num1 = input.nextInt();

	System.out.print("Enter secondNumber");

	int num2 = input.nextInt();

	int num3 = (num1 * num1 * num1);

	int num4 = (num2 * num2);

	int multiple = num4 % num3;

	if(num4 % num3 == 0){
	System.out.printf("multiple is %d%n", multiple); 
	}
	if(num4 % num3 != 0){
	System.out.printf("multiple is not %d%n", multiple); 
	}



	



	}




 }