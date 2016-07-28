package labs;

import java.util.Arrays;

public class MyClass {

	public static void main(String[] args) {
		
		//initialized int array
		
		int[] arr = new int[7];
		
		//initialized String array
		String[] arr2 = new String[3];
		
		System.out.println(arr2[2]);
		
		//char[] arr3 = new char[5];
		
		//System.out.println(arr3[1]);
		
		//initialize char array
		
		char[] arr3 = new char[5];
		
		//add elements to an int array
		
		int[] myArray = {1, 2, 3, 4};
		
		
		int arrayName[];
		arrayName = new int[3];
		arrayName[0] = 2;
		arrayName[1] = 22;
		arrayName[2] = 33;
		
		System.out.println(arrayName[1]);
				
		
		double[] prices = {14.95, 12.95, 11.95, 9.95};
		for (int i=0; i< prices.length; i++)
		{
			System.out.println(prices[i]);
		}
		
		//for each value in prices
		for(double value: prices)
	{
			System.out.println(value);
	}
		
		for (int i= prices.length-1; i>=0; i--){
			System.out.print(prices[i] + " ");
		}
		
		Arrays.fill(prices, 2, 3, 18.75);
		
		for (int i= prices.length-1; i>=0; i--){
		System.out.println();
		System.out.print(prices[i]);
		
		double[] grades = {92.3, 88.0, 95.2, 90.5};
		
		double[] percentages = Arrays.copyOf(grades, grades.length);
		
		percentages[1] = 70.2;
		
		grades[3] = 23.5;
		
		System.out.println("grades[1] = " + grades[1]);
		System.out.println("percentages[3] =" + percentages[3]);
		
		Arrays.sort(grades);
		
		
	}
}
}
