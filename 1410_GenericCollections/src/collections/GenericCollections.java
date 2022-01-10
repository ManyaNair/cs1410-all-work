package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class GenericCollections
{
	public static void main(String[] args)
	{
		//List<Character> LNInputList = Arrays.asList('?', 'a', 'B', 'c', '5', 'd', 'E', 'F', 'g', '%', '#', 'H');
		//List<Integer> modifyList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7));
		//List<Object> removeNList = new ArrayList<Object>(Arrays.asList());
		//System.out.println(lettersAndNumbers(LNInputList));
		//System.out.println(modify(modifyList));
		//removeEveryNthElement(removeNList, 1);
	}
	
	public static List<String> lettersAndNumbers(List<Character> list)
	{
		List<String> output =new ArrayList<String>();
		Collections.reverse(list);
		for (Character i : list)
		{
			if(Character.isUpperCase(i))
			{
				output.add("U(" + Character.toLowerCase(i) + ")");
			}
			else if(Character.isLowerCase(i))
			{
				output.add("L(" + Character.toLowerCase(i) + ")");
			}
			else if(Character.isDigit(i))
			{
				output.add("N(" + i + ")");
			}
			
		}
		return output;
	}
	
	public static int modify(List<Integer> list)
	{
		int numReturn;
		String storeNums = "";
		List<Integer> multiplesOf4 = new ArrayList<Integer>(Arrays.asList(4,8,12,16,20));
		List<Integer> multiplesOf5 = new ArrayList<Integer>(Arrays.asList(5,10,15,20,25));
		List<Integer> multiplesOf6 = new ArrayList<Integer>(Arrays.asList(6,12,18,24,30));
		if(list.isEmpty())
		{
			throw new NullPointerException("The list is empty");
		}
		else
		{
			list.removeIf(a-> a % 3 == 0);
			list.addAll(multiplesOf4);
			list.addAll(multiplesOf5);
			list.addAll(multiplesOf6);
			Collections.sort(list);
			for(int i : list)
			{
				storeNums += i + " ";
			}
			HashSet<Integer> distinctNums = new HashSet<Integer>(list);
			numReturn = distinctNums.size();
		}
		return numReturn;
	}
	
	public static void removeEveryNthElement (List<?> list, int n)
	{
		List<Object> output =new ArrayList<Object>();
		if(list.isEmpty())
		{
			throw new NullPointerException("The list is empty");
		}
		else
		{
			list.remove(n-1);
			for (Object i : list)
			{
				output.add(i);
			}
		}
		//System.out.println(output);
	}
	
}
