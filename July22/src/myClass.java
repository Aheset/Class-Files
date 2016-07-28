
public class myClass {

	
	public static void main(String[] args) {
		
		
		
		
	}



public static long getFactorial(int input)

{
	if (input ==1) return 1;
	
	return input * getFactorial(input-1);
	
	//n! =
	//n * (n-1)!
	//4! = 4 * 3!
	// 4 * 3 * 2!
	// 4 * 3 * 2 * 1!
	
	
	
	/*
	 return 4 * getFactorial(3)
	 	* 3 * getFactorial(2)
	 		* 2 * getFactorial(1)
	 */
}


}
