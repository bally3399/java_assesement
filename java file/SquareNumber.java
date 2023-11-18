import java.util.Scanner;
public class SquareNumber{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter firstNumber");
	
	int num1 =input.nextInt();
	
	System.out.print("Enter secondNumber");

	int num2 = input.nextInt();

	int squareNum1 =(num1 * num1);
	
	int squareNum2 =(num2 * num2);

	int add =(squareNum1 + squareNum2);

	System.out.printf("sum is %d%n" ,add);

	int difference = (squareNum1 - squareNum2);

	System.out.printf("sum and difference is %d%n ,%d%n", add , difference);


}




}