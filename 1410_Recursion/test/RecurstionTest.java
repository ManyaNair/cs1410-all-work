import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import recursion.Recursion;

class RecurstionTest
{

	@Test
	void testOfSumOfDigitsWithNegativeNumber()
	{
		int expected = 7;
		int actual = Recursion.sumOfDigits(-34);
		assertEquals(expected, actual);
	}
	@Test
	void testOfSumOfDigitsWithLargeNumber()
	{
		int expected = 12;
		int actual = Recursion.sumOfDigits(1038);
		assertEquals(expected, actual);
	}
	@Test
	void testOfSumOfDigitsWithZero()
	{
		int expected = 0;
		int actual = Recursion.sumOfDigits(0);
		assertEquals(expected, actual);
	}
	@Test
	void testOfSumOfDigitsWithLargeNegativeNumber()
	{
		int expected = 10;
		int actual = Recursion.sumOfDigits(-1234);
		assertEquals(expected, actual);
	}
	@Test
	void testOfSumOfDigitsWithSingleDigit()
	{
		int expected = 7;
		int actual = Recursion.sumOfDigits(7);
		assertEquals(expected, actual);
	}
	@Test
	void testOfSumOfDigitsWithAnotherNumber()
	{
		int expected = 15;
		int actual = Recursion.sumOfDigits(87);
		assertEquals(expected, actual);
	}
	@Test
	void testOfSumOfDigitsWithNegativeOne()
	{
		int expected = 1;
		int actual = Recursion.sumOfDigits(-1);
		assertEquals(expected, actual);
	}
	@Test
	void testOfSumOfDigitsWithLargePostiveNumber()
	{
		int expected = 30;
		int actual = Recursion.sumOfDigits(8967);
		assertEquals(expected, actual);
	}
	@Test
	void countOfSmilesWithTeacherEx1()
	{
		int expected = 2;
		char [] testArray = {':',')',' ','L','i','f','e',' ','i','s',' ','g','o','o','d',' ',':',')'};
		int actual = Recursion.countSmiles(testArray, 0);
		assertEquals(expected, actual);
	}
	@Test
	void countOfSmilesWithTeacherEx2()
	{
		int expected = 3;
		char [] testArray = {'H', 'a','p','p','y',' ','d','a','y',' ',':',')',':',')',':',')','!'};
		int actual = Recursion.countSmiles(testArray, 0);
		assertEquals(expected, actual);
	}
	@Test
	void countOfSmilesWithTeacherEx3()
	{
		int expected = 0;
		char [] testArray = {'a',':','b','(','c',':',' ',')','e'};
		int actual = Recursion.countSmiles(testArray, 0);
		assertEquals(expected, actual);
	}
	@Test
	void countOfSmilesWithRandomCharArray1()
	{
		int expected = 1;
		char [] testArray = {':',')',':','(',':','D',':','O',':',';'};
		int actual = Recursion.countSmiles(testArray, 0);
		assertEquals(expected, actual);
	}
	@Test
	void countOfSmilesWithRandomCharArray2()
	{
		int expected = 0;
		char [] testArray = {'a',  'b', 'c', 'd', 'e', ':', '('};
		int actual = Recursion.countSmiles(testArray, 0);
		assertEquals(expected, actual);
	}
	@Test
	void countOfSmilesRandomCharArray3()
	{
		int expected = 6;
		char [] testArray = {':', ')',':', ')',':', ')',':', ')',':', ')',':', ')'};
		int actual = Recursion.countSmiles(testArray, 0);
		assertEquals(expected, actual);
	}
	@Test
	void countOfSmilesRandomCharArray4()
	{
		int expected = 1;
		char [] testArray = {':', ')'};
		int actual = Recursion.countSmiles(testArray, 0);
		assertEquals(expected, actual);
	}
	@Test
	void countOfSmilesRandomCharArray5()
	{
		int expected = 0;
		char [] testArray = {'a',  'b', 'c', 'd'};
		int actual = Recursion.countSmiles(testArray, 0);
		assertEquals(expected, actual);
	}
	@Test
	void makeStringUpperCaseTeacherEx1()
	{
		String expected = "H I   T H E R E ! ";
		String actual = Recursion.toUpper("Hi there!");
		assertEquals(expected, actual);
	}
	@Test
	void makeStringUpperCaseTeacherEx2()
	{
		String expected = "I   L O V E   R A M E N ";
		String actual = Recursion.toUpper("I love ramen");
		assertEquals(expected, actual);
	}
	@Test
	void makeStringUpperCaseTestWithSpace()
	{
		String expected = "  ";
		String actual = Recursion.toUpper(" ");
		assertEquals(expected, actual);
	}
	@Test
	void makeStringUpperCaseWithOneWord()
	{
		String expected = "L O L ";
		String actual = Recursion.toUpper("lol");
		assertEquals(expected, actual);
	}
	@Test
	void makeStringUpperCaseWithNumberInput()
	{
		String expected = "1 2 3 ";
		String actual = Recursion.toUpper("123");
		assertEquals(expected, actual);
	}
	@Test
	void makeStringUpperCaseWithNumbersAndLetters()
	{
		String expected = "C S 1 4 1 0 ";
		String actual = Recursion.toUpper("cs1410");
		assertEquals(expected, actual);
	}
	@Test
	void makeStringUpperCaseWithAlreadyCaps()
	{
		String expected = "A L L   C A P S ";
		String actual = Recursion.toUpper("ALL CAPS");
		assertEquals(expected, actual);
	}
	@Test
	void makeStringUpperCaseWithFunkyWord()
	{
		String expected = "A D J ; A K ";
		String actual = Recursion.toUpper("adj;ak");
		assertEquals(expected, actual);
	}

}


