package labCollection;

import java.util.ArrayList;
import java.util.List;

public class Warmup
{
	public static void main(String[] args)
	{
		List<Integer> numbers = new ArrayList<Integer>();
		for (int i = 2; i <= 50; i+=2)
		{
			numbers.add(i);
		}
		System.out.println("Contents of array numbers:");
		printNumbersArray(numbers);
		System.out.println("\n" + "Removing multiples of three");
		numbers.removeIf(a-> a % 3 == 0);
		printNumbersArray(numbers);
		
	}

	private static void printNumbersArray(List<Integer> numbers)
	{
		for (Integer i : numbers)
		{
			System.out.print(i + " ");
		}
	}
	
}
