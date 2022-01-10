package m04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 * @author manya
 *
 */
public class Module04
{
	
	/**
	 * 
	 * @param numbers
	 * @return The first method takes the the list input of numbers and divides each one by 10
	 * it then takes the divided numbers and adds it into the List Store. From there we check if any numbers in Store are less than one
	 * and removes it if it is. After that it removes the duplicates in Store and sorts it by descending order (big to small).
	 * 
	 * After it has completed all those steps it returns Store.
	 */
	public static List<Double> method1(List<Double> numbers)
	{
		List<Double> Store = new ArrayList<Double>();
		for (Double double1 : numbers)
		{
			double divide = double1.doubleValue() / 10;
			Store.add(divide);
		}
		Store.removeIf(i -> i < 1);
		List<Double> removedDuplicates = Store.stream().distinct().collect(Collectors.toList());
		Store = removedDuplicates;
		Collections.sort(Store, Collections.reverseOrder());
		return Store;
	}
	
	/**
	 * 
	 * @param numbers
	 * @return method2 takes in the input as a List of integers named numbers and shifts the first element to the end 3 times 
	 * using the Collection.rotate() method. After rotation it converts the integers into binary and adds it into another list
	 * under the name of BinaryRep. From BinaryRep we check if any of the strings are greater than or equal to 10 characters and
	 * removes it if it is. 
	 * 
	 * The final return is the List of type String BinaryRep.
	 */
	public static List<String> method2(List<Integer> numbers)
	{
		List<String> binaryRep = new ArrayList<String>();
		for(int i = 0; i<=2; i++)
		{
			Collections.rotate(numbers, -1);
		}
		for (Integer makeBinary : numbers)
		{
			binaryRep.add(Integer.toBinaryString(makeBinary));
		}
		binaryRep.removeIf(n -> n.length() >= 10);
		return binaryRep;
		
	}
}