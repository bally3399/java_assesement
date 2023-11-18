import java.util.Scanner;
public class ApplicationOfInteger {
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter firstNumber");

	int num1 = input.nextInt();

	System.out.print("Enter secondNumber");

	int num2 = input.nextInt();

	System.out.print("Enter thirdNumber");

	int num3 = input.nextInt(); 
	
	int sum = num1 + num2 + num3;

	System.out.printf("sum is %d%n", sum);
	
	int average = sum/3;

	System.out.printf("The average is %d%n", average);

	int product = num1 * num2 * num3;

	System.out.printf("product is %d%n", product);

	if(num1>num2 && num1>num3) {
	System.out.println("num1 is the largest");
	}

	if(num2>num1 && num2>num3) {
	System.out.println("num2 is the largest");
}
	if(num3>num1 && num3>num2) {
	System.out.println("num3 is the largest");
}
	if(num1<num2 && num1<num3) {
	System.out.println("num1 is the smallest");
}
	
	if(num2<num1 && num2<num3) {
	System.out.println("num2 is the smallest");
}
	if(num3<num1 && num3<num2) {
	System.out.println("num3 is the smallest");
}
	

}




}
