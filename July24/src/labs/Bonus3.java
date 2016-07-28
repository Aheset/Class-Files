package labs;

import java.util.Scanner;

public class Bonus3 {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the Guess a Number Game!");
		System.out.println("+++++++++++++++++++++++++++++++++++\n");
		
		System.out.println("I am thinking of a number between 1 and 100.\nTry to guess it, noob.");
		Scanner scan1 = new Scanner(System.in);
		//Math.random was generating 0 which I do not want so adding 1 infront of the math random takes care of the problem
		//Math.random is a double type so it prints decimals after the number to avoid that 
		//I used casting- adding (int) infront of Math.random.  I put it before 1 and it was printing only 1.
	
		int input = scan1.nextInt();
		scan1.nextLine();
		
		int computerNumber = 1 + (int) (Math.random()*100);
	
	
	
		scan1.close();	

	
	}
	
	
}
