package codingBat;

public class CodingBat
{
	/**
	 * Given a string and a non-empty word string, return a string made of each char
	 * just before and just after every appearance of the word in the string. Ignore
	 * cases where there is no char before or after the word, and a char may be
	 * included twice if it is between two words.
	 * 
	 * 
	 * wordEnds("abcXY123XYijk", "XY") → "c13i" wordEnds("XY123XY", "XY") → "13"
	 * wordEnds("XY1XY", "XY") → "11"
	 * 
	 * @param str
	 * @param word
	 */
	public static String wordEnds(String str, String word)
	{
		String store = "";
		int index = 0;
		while(index!= -1 && str.length() != word.length())
		{
			index = str.indexOf(word, index);
			
			if(index != -1 && index + word.length() <= str.length())
			{
				if(index == 0)
					store += str.charAt(index + word.length());
				else if (index == str.lastIndexOf(word) && index == str.length() - word.length()) 
				{
					store+= str.charAt(index -1);
				}
				else
				{
					store += str.charAt(index - 1);
					store += str.charAt(index + word.length());
				}
				index++;
			}
			
		}
		return store;
	}
}
