import java.util.Scanner;
public class RaiseToPower{
       public static void main(String[] args){
       Scanner input =new Scanner(System.in);
       System.out.print("first num: ");
       int num1 = input.nextInt();
       System.out.print("second num: ");
       int num2 = input.nextInt();
   
    int result= (int)Math.pow(num1,num2);

System.out.printf("%d Raise To Power %d is %d%n",num1,num2,result);
    
       
      
     }  




} 