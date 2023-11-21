import java.util.Scanner;

public class Bmi{

	public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter kilogram");

	int kilogram = scanner.nextInt();
	System.out.print("Enter height");
	int height = scanner.nextInt();
	int heightInMeters = height * height;

	int bmi = kilogram / heightInMeters;
	if(bmi < 18.5){
	System.out.print("under weight");
	}
	else if(bmi >= 18.5 && bmi < 24.9){
	System.out.print("normal weight");
	}


	}





}