package m01;
/**
 * 
 * @author manya
 * Module 01 test for CS 1410
 */
public class Module01
{
	public static void main(String[] args)
	{
		
	}
	/**
	 * 
	 * @param str the string input is taken from Module01TestCases
	 * @return the return is a new string with <> on either side as well as a - in the spaces
	 * if the string contains a cis, cs, or csis it will be replaced with CSIS
	 */
	public static String transform(String str)
	{
		//initializes all the values for this method
		StringBuilder sb = new StringBuilder();
		int i = 0;
		//adds the starting alligator mouth
		sb.append("<");
		
		str = str.toLowerCase();
		/**
		 * These if and else if statements check to see if cis, cs, or csis is existant in the string input
		 */
		if(str.startsWith("cis") && !str.contains("cs") && !str.contains("csis"))
		{
			str = str.replace("cis", "CSIS");
		}
		else if(str.contains("cs") && !str.contains("cis") && !str.contains("csis"))
		{ 
			str = str.replace("cs", "CSIS");
		}
		else if(str.startsWith("csis") && !str.contains("cis"))
		{ 
			str = str.replace("csis", "CSIS");
		}
		
		/**
		 * This block of code adds the - in all the spaces
		 */
		if(str.contains(" ") || str.contains("CSIS"))
		{
			while (i < str.length())
			{
				if(str.charAt(i) == ' ')
				{
					sb.append('-');
					i++;
				}
				else
				{	
					sb.append(str.charAt(i));
					i++;
				}
			}
		}
		//adds the closing alligator mouth
		sb.append(">");
		//return the string
		return sb.toString();
	}

}
