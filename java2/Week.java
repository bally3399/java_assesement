import java.util.Scanner;

public class Week{

	public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter year");
	int year = scanner.nextInt();

	System.out.print("Enter month");
	int month = scanner.nextInt();

	System.out.print("Enter the days of the month");
	int daysOfTheMonth =  scanner.nextInt();

	int century = year / 100;

	int yearOfCentury = year % 100;

	int month1 = daysOfTheMonth;
	int month2 = 26 * (month + 1) / 10;
	int century1 = yearOfCentury;
	int century2 = yearOfCentury / 4;
	int year1 = century / 4;
	int year2 = 5 * century;
 	int daysOfTheWeek = (month1 + month2 + century1 + century2 + year1 + year2) % 7;

	if(daysOfTheWeek == 0) {
	System.out.print("Saturday");

	}
	if(daysOfTheWeek == 1) {
	System.out.print("Sunday");
	}
	if(daysOfTheWeek == 2) {
	System.out.print("Monday");

	}
	if(daysOfTheWeek == 3) {
	System.out.print("Tuesday");
	}
	if(daysOfTheWeek == 4) {
	System.out.print("Wednesday");
	}

	if(daysOfTheWeek == 5) {
	System.out.print("Thursday");
	}
	if(daysOfTheWeek == 6) {
	System.out.print("Friday");
	}





	}






}