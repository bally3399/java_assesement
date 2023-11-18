import java.util.Scanner;

public class ComparingNumber{

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number");

	int num = input.nextInt();

	int SquareNum = (num * num);

	if(num>100) {
      System.out.printf("%d is greater than 100",num);
}
	
       if(SquareNum>100) {
      System.out.printf("%d is greater than 100",SquareNum);
}


	if(num<100) {
      System.out.printf("%d is less than 100",num);
}

	if(SquareNum<100) {
      System.out.printf("%d is less than 100",SquareNum);
}

	if(num==100) {
      System.out.printf("%d is equal to 100",num);
}

	if(SquareNum==100) {
      System.out.printf("%d is equal to 100",SquareNum);
}

	if(num!=100) {
      System.out.printf("%d is not equal to 100",num);
}


if(SquareNum!=100) {
      System.out.printf("%d is not equal to 100",SquareNum);
}


}







}