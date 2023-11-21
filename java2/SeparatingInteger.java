import java.util.Scanner;

public class SeparatingInteger{

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter five digit number ");

	int num = input.nextInt();

	int firstDigit = num / 10000;
       
	int remainder = num % 10000;

	int secondDigit = remainder/ 1000;

	int remainder1 = remainder% 1000;

	int thirdDigit = remainder1/ 100;

	int remainder2 = remainder1 % 100;

	int forthDigit = remainder2/ 10;

	int fifthDigit = remainder2 % 10;


	System.out.printf("%d  %d  %d  %d  %d",firstDigit,secondDigit,thirdDigit,forthDigit,fifthDigit);
	


	}




}

