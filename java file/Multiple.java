import java.util.Scanner;

public class Multiple{

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter firstNumber");

	int num1 = input.nextInt();

	System.out.print("Enter secondNumber");

	int num2 = input.nextInt();

	System.out.print("Enter thirdNumber");

	int num3 = input.nextInt();

	System.out.print("Enter forthNumber");

	int num4 = input.nextInt();

	System.out.print("Enter fifthNumber");

	int num5 = input.nextInt();

	if(num1>num2 && num1>num3 && num1>num4 && num1>num5) {
	System.out.println("num1 is the largest");
	}

 	if(num2>num1 && num2>num3 && num2>num4 && num2>num5) {
	System.out.println("num2 is the largest");
	}
	
	if(num3>num1 && num3>num2 && num3>num4 && num3>num5) {
	System.out.println("num3 is the largest");
        }
	
	if(num4>num1 && num4>num2 && num4>num3 && num4>num5) {
	System.out.println("num4 is the largest");
	}

	if(num5>num1 && num5>num2 && num5>num3 && num5>num4) {
	System.out.println("num5 is the largest");
	}
	
	if(num1<num2 && num1<num3 && num1<num4 && num1<num5) {
	System.out.println("num1 is the smallest");
	}
	
	if(num2<num1 && num2<num3 && num2<num4 && num2<num5) {
	System.out.println("num2 is the smallest");
	}

	if(num3<num1 && num3<num2 && num3<num4 && num3<num5) {
	System.out.println("num3 is the smallest");
        }
	
	if(num4<num1 && num4<num2 && num4<num3 && num4<num5) {
	System.out.println("num4 is the smallest");
	}

	if(num5<num1 && num5<num2 && num5<num3 && num5<num4) {
	System.out.println("num5 is the smallest");
	}

        } 








}