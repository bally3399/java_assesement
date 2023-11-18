import java.util.Scanner;

public class Value{

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter first number");

	int num1 = input.nextInt();

	System.out.print("Enter second number");

	int num2 = input.nextInt();

	System.out.print("Enter third number");

	int num3 = input.nextInt();

	System.out.print("Enter forth number");

	int num4 = input.nextInt();

	System.out.print("Enter fifth number");

	int num5 = input.nextInt();

        int positiveNum = 0;

        int negativeNum = 0;

        int zeroNum     = 0;

        if(num1>0) { 
	positiveNum = positiveNum + 1;
}
	if(num2>0) {
	positiveNum = positiveNum + 1;
}

	if(num3>0) {
	positiveNum = positiveNum + 1;
}

	if(num4>0) {
	positiveNum = positiveNum + 1;
}
	if(num5>0) {
	positiveNum = positiveNum + 1;
}
	System.out.printf("positiveNum is %d%n", positiveNum);

	if(num1<0) {
	negativeNum = negativeNum + 1; 
}

	if(num2<0) {
	negativeNum = negativeNum + 1;
}
	if(num3<0) {
	negativeNum = negativeNum + 1;
}
	if(num4<0) {
	negativeNum = negativeNum + 1;
}

	if(num5<0) {
	negativeNum = negativeNum + 1;
}
	System.out.printf("negativeNum is %d%n", negativeNum);

	if(num1==0) {
	zeroNum = zeroNum + 1;
}
	if(num2==0) {
	zeroNum = zeroNum + 1;
}
	if(num3==0) {
	zeroNum = zeroNum + 1;
}
	if(num4==0) {
	zeroNum = zeroNum + 1;
}
	if(num5==0) {
	zeroNum = zeroNum + 1;
}
	System.out.printf("zeroNum is %d%n", zeroNum);

	
}






}