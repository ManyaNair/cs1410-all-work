package recursion;

public class Recursion
{
	public static int sumOfDigits(int n)
	{
		int sum = 0;
		try
		{
			if(n==0)
				return 0;
			n = Math.abs(n);
			while(n > 0)
			{
				sum += n % 10;
				n = n / 10;
			}
			return sum;
		} 
		catch (NumberFormatException e)
		{
			return 0;
		}
	}
	public static int countSmiles(char[] letter, int index)
	{
		int count = 0;
		index = 0;
		while(index < letter.length)
		{
			if(letter[index] == ':' && letter[index+1] == ')')
			{
				count++;
			}
			index++;
		}
		return count;
	}
	public static String toUpper(String str)
	{
		str = str.toUpperCase();
		int i = 0;
		String finalStr = "";
		while(i < str.length())
		{
			finalStr += str.charAt(i) + " ";
			i++;
		}
		return finalStr;
	}
}
