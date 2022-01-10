package wrapperClass;

import java.util.Random;

public class DemoWrapperClass
{
	/** * Demonstrates the functionality provided in class DemoWrapperClass. * */ 
	public static void main(String[] args) 
	{ 
		Random rand = new Random(); 
		// Method minMax: 
		System.out.println(minMax()); 
		System.out.println();
		// Method numberRepresentations: 
		int[] numbers = { 9, 17, getRandomThreeDigitNumber(), 9876, 12345}; 
		//System.out.printf("%-7s %-7s %-6s %s%n", "Base 10", "Base 16", "Base 8", "Base 2");
		//System.out.printf("%-7s %-7s %-6s %s%n", "-------", "-------", "------", "------");
		//for(int n : numbers) { System.out.println(numberRepresentations(n)); } System.out.println(); 
		// Method charProperties: 
		//char[] characters = {'8', ' ', '#', 'a', 'M', getRandomLetter()}; 
		//for(char c : characters) { System.out.println(charProperties(c)); } System.out.println(); 
		// Method parse: String[] numberArray = {"1.1", "2.5", "3.14","40.04", "5.325", "63.5"}; 
		//String[] wholeNumbers = new String[10]; 
		//for(int i = 0; i < wholeNumbers.length; i++) { wholeNumbers[i] = "" + (rand.nextInt(90) + 10); } 
		//System.out.println(Arrays.deepToString(numberArray) + " .. sum = " + parseSum(numberArray)); }
	}
	static String minMax() {
		return 	(
					"Byte: \n" + "Min: " + Byte.MIN_VALUE + "\nMax: " + Byte.MAX_VALUE +
					"\n\nShort: \n" + "Min: " + Short.MIN_VALUE + "\nMax: " + Short.MAX_VALUE +
					"\n\nInteger: \n" + "Min: " + Integer.MIN_VALUE + "\nMax: " + Integer.MAX_VALUE +
					"\n\nLong: \n" +"Min: " + Long.MIN_VALUE + "\nMax: " + Long.MAX_VALUE + "\n"
				);
	}
	static String numberRepresentation(int num)
	{
		return (
				 "Base 10  Base 16  Base 8  Base 2 \n"
				+ "-------  -------  ------  ------ \n"
				+ num.toString(num.parseInt(num, 8))
				
				);
	}
	
}
