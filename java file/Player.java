import java.util.Scanner;

public class Player{

	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Player1 enter your name: ");
	String name1 = input.nextLine();

	System.out.print("Player2 enter your name: ");
	String name2 = input.nextLine();

	System.out.printf("%s %s",name1,"enter a number 0, 1, or 2: ");
	int num1 = input.nextInt();
	
	System.out.printf("%s %s",name2,"enter a number 0, 1, or 2: ");
	int num2 = input.nextInt();
	
	
	int scissors = 0;
	int rock = 1;
	int paper =2;
	
	if(num1 == rock && num2 == scissors) {
	System.out.print("The winner is" + name1);
	}	

	if(num1 == paper && num2 == rock) {
	System.out.print("The winner is" + name1);
	}

	if(num1 == scissors && num2 == rock) {
	System.out.print("The winner is" + name2);
	}

	if(num1 == rock && num2 == paper) {
	System.out.print("The winner is" + name2);
	} 
	
	if(num1 == paper && num2 == scissors) {
	System.out.print("The winner is" + name1);
	} 

	if(num1 == scissors && num2 == paper) {
	System.out.print("The winner is" + name2);
	}

	if(num1 == rock && num2 == rock) {
	System.out.print("it is a tie");
	}

	if(num1 == scissors && num2 == scissors) {
	System.out.print("it is a tie");
	}

	if(num1 == paper && num2 == paper) {
	System.out.print("it is a tie");
        }
 

	}

}






