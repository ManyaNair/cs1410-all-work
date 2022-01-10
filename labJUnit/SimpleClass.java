package labJUnit;

/**
 * Simple class to demonstrate automated testing with JUnit Jupiter (JUnit 5).
 * 
 * @author YourName
 *
 */

public class SimpleClass
{

	/**
	 * Determines whether a given year is a leap year.
	 * <p>
	 * 
	 * @param y year
	 * @return true if <code>year</code> is a leap year and false otherwise.
	 * @throws IllegalArgumentException if <code>year</code> is not positive.
	 */
	public static boolean isLeapYear(int year) throws IllegalArgumentException
	{
		boolean flag = false;
		try
		{
			if (year <= 0)
			{
				throw new IllegalArgumentException();
			}
			if (year % 4 == 0)
				flag = true;
			if (year % 100 == 0)
				flag = false;
			if (year % 400 == 0)
				flag = true;

			return flag;
		}

		catch (IllegalArgumentException e)
		{
			throw new IllegalArgumentException();
		}
	}
}
