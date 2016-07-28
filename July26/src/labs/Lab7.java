package labs;

import java.util.*;



import java.util.Scanner;

public class Lab7 {

	public static void main(String[] args) throws Exception {
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Welcome to our Java class.  Which student would you like to learn more about?");

//prompt user to ask abut a particular student
		int userInput = scan1.nextInt();
		scan1.nextLine();
		//a method that throws an unchecked exception
		
		if (userInput > 20 || userInput < 0)
		{
			throw new IllegalArgumentException("That student does not exist.  Please try again. Enter a number 1-20.");
		}
		else
		{
		System.out.println("Student" + userInput + " is Kim Driscoll.  What would you like to know about Kim?");
		System.out.println("Enter \"hometown\" or \"favorite\" food: ");
		}
		System.out.println("That student does not exist.  Please try again. Enter a number 1-20.");
		
		
		
		/*
		try
		{
			if (userInput > 20 || userInput < 0)
				throw new Exception("That student does not exist.  Please try again. Enter a number 1-20.");
			else		
		System.out.println("Student 10 is Kim Driscoll.  What would you like to know about Kim?");
		System.out.println("Enter \"hometown\" or \"favorite\" food: ");
		}
		catch (IllegalArgumentException e)
		{
			System.out.println(e);
		}
		
		//try
		//{
			if (userInput > 20 || userInput < 0)
		//}
		//catch (Exception e)
		{
			
		}
		
		
	
		System.out.println("That data does not exist.  Please try again. Enter \"hometown\" or \"favorite food\"");
		
		System.out.println("Kim is from Detroit, MI.  Would you like to know more? Enter \"yes\" or \"no\"");
		
		System.out.println("Thanks!");
*/
	
	scan1.close();
	}



}
