import java.util.Scanner;//crtl shift o after you do new Scanner

public class myClassStrings {
	
	public static void main(String[] args) {
		
		Scanner scan1 = new Scanner(System.in);
		String input = scan1.nextLine();
		
		System.out.println(input.indexOf("l"));
		System.out.println(input.lastIndexOf("l"));		
		System.out.println(input.length());
		
		String s = "Hello World";
		
		System.out.println(s.substring(1, 3));
		System.out.println(s.substring(3));
		//substring is exclusive, 3 is not included
		//String s = "Hello";
		
		//s = s + " World";
		//+ concatenate
		
		//or you can do
		//s= s.concat("world");
		
		
		
		//System.out.println(s);
	}

}
