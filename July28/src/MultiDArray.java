import java.util.*;
import java.util.Scanner;

public class MultiDArray {


        public static void main(String[] args) {
            // TODO Auto-generated method stub
            
            Scanner scan1 = new Scanner(System.in);
            String choice = "yes";
            int userInput= 0;
            System.out.println("Welcome to our Java Class!");
            while (choice.equalsIgnoreCase("yes"))
            {
                
                String [][] student = {{"Lily", "Anna", "Kim"},{"Commerce", "Southfield", "Detroit"}, {"Steak", "Salad", "Hummus"}};
                

                try
            	{
            		System.out.println("Student " + userInput + " is " + student[userInput - 1] + ".  What would you like to know about " + student[userInput - 1] + "?" );
            	    System.out.println("Enter \"hometown\" or \"favorite food\":");
            	}


            //catch (IllegalArgumentException e)  -- this doesn't work.
            catch (IndexOutOfBoundsException e)
            //catch (Exception e) -- this works, the easy way out
            	{

            	System.out.println("That student does not exist.  Please try again. Enter a number (1-20);");

            	}
               
                
                
                
                /*               try {
                System.out.println("Which student would you like to learn more about? (Enter a number from 0-20)");
                userInput = scan1.nextInt();
                 d       scan1.nextLine();}
                
                //catch (IndexOutOfBoundsException e)
              //catch (IllegalArgumentException e)  -- this doesn't work.
                //catch (IndexOutOfBoundsException e)
                catch (Exception e) //-- this works, the easy way out
                	{

                	System.out.println("That student does not exist.  Please try again. Enter a number (1-20);");

                	}
                	//student[0] is the name of the student
   */         
                {System.out.println("Student " + userInput + " is " + student [0][userInput-1]);
                
                	//student[1] is the location of the student
                System.out.println("What would you like to know about " + student [0][userInput-1] + "? (Enter hometown or fav food)"); 
                
                String homeTownOrFavFood = scan1.nextLine();    
                
                
                    if (homeTownOrFavFood.equalsIgnoreCase("hometown"))
                            {
                        System.out.println(student[1][userInput-1] + " is from " + student[2][userInput-1] );
                        
                            }
                    else if (homeTownOrFavFood.equalsIgnoreCase("fav food"))
                    {
                        System.out.println(student [1][userInput-1] + "'s favorite food is " + student[3][userInput-1] + ".") ;
                    }
                }
                
                

            }
            
        }
    }