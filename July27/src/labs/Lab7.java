
package labs;

import java.util.*;

public class Lab7 {

	public static void main(String[] args) {

		Scanner scan1 = new Scanner(System.in);
		
		System.out.println("Welcome to our Java class.  Which student would you like to learn more about?");
		int userInput = scan1.nextInt();
		scan1.nextLine();	
		String choice = "yes";
       
    //    while (choice.equalsIgnoreCase("yes"))
        {		
		String [][] student = {{"Lily", "Anna", "Kim"},{"Commerce", "Southfield", "Detroit"}, {"Steak", "Salad", "Hummus"}};
		
	/*	String[] studentName = {"Lily", "Kim", "Anna"};
		String[] homeTown = {"Commerce Twshp", "Detroit", "Southfield"};
	    String[] favoriteFood = {"Steak", "Salad ", "Pasta"};
	*/
	
//prompt user to ask abut a particular student

	
		try
	{
		System.out.println("Student " + userInput + " is " + student[0][userInput - 1] + ".  What would you like to know about " + student[0][userInput - 1] + "?" );
	    System.out.println("Enter \"hometown\" or \"favorite food\":");
	}


//catch (IllegalArgumentException e)  -- this doesn't work.
catch (IndexOutOfBoundsException e)
//catch (Exception e) -- this works, the easy way out
	{

	System.out.println("That student does not exist.  Please try again. Enter a number (1-20);");

	}

	    String homeTownInput = scan1.nextLine();

try
{
	    
	System.out.println(student[0][userInput -1] + " is from " + student[1][userInput -1] + ".  Would you like to know more? Enter \"yes\" or \"no\":");
}

catch (IllegalArgumentException e)
{
	System.out.println("That data does not exist.  Please try again.  (enter or \"hometown\" or \"favorite food\"");
}
choice.equalsIgnoreCase("no");
System.out.println("Bye");
 } 
}
	
}
	
