import java.util.Scanner; 

public class FindDays{

public static void main(String[] args){
Scanner input = new Scanner(System.in);

	System.out.println("Enter the number of the month");
	int numberOfMonth = input.nextInt();
	
	System.out.println("Enter the year");
	int year = input.nextInt();

	String month = "";
	int numberOfDays = 0;
	
	if(numberOfMonth == 1){
			month = "january";
			numberOfDays = 31;	
		}
	if(numberOfMonth == 2 && year %4 == 0){
		month = "february";
		numberOfDays = 29;
	}
	
		if(numberOfMonth == 2 && year % 4!=0){
			month = "february";
			numberOfDays = 28;	
		}
		if(numberOfMonth == 3){
			month = "march";
			numberOfDays = 31;	
		}

		if(numberOfMonth == 4){
			month = "april";
			numberOfDays = 30;	
		}
		if(numberOfMonth == 5){
			month = "may";
			numberOfDays = 31;	
		}
		if(numberOfMonth == 6){
			month = "june";
			numberOfDays = 30;	
		}
		if(numberOfMonth == 7){
			month = "july";
			numberOfDays = 31;	
		}
		if(numberOfMonth == 8){
			month = "august";
			numberOfDays = 31;	
		}
		if(numberOfMonth == 9){
			month = "september";
			numberOfDays = 30;	
		}
		if(numberOfMonth == 10){
			month = "octomber";
			numberOfDays = 31;	
		}
		if(numberOfMonth == 11){
			month = "november";
			numberOfDays = 30;	
		}
		if(numberOfMonth == 12){
			month = "december";
			numberOfDays = 31;	
		}

	System.out.printf("%s %d has %d number of days", month, year, numberOfDays);
	}


	}
