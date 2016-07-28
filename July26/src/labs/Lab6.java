package labs;

import java.util.Scanner;

public class Lab6 {
	public static void main(String[] args) {
		
		//Pig Latin project
		//Define variable
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Please enter a word:  ");
		String userInput = scan1.nextLine().toLowerCase();
		
		String translatedWord;
		translatedWord = userInput.substring(1);
		char firstLetter;
		
		
		//System.out.println(translatedWord);
		
		firstLetter = userInput.charAt(0);
		//System.out.println(firstLetter);
		
		translatedWord = translatedWord + firstLetter + "ay";
		System.out.println(translatedWord);
		
		if (firstLetter == 'a' || firstLetter == 'e' || firstLetter == 'i' || firstLetter == 'o' || firstLetter =='u' )
		{
			System.out.println(userInput + "way");
		}
		else
		{
			System.out.println(translatedWord);
		}
		
		
		scan1.close();
	}

}
