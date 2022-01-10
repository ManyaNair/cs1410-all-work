package m04;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class m04Test
{
	//random doubles to check the method with. It includes doubles as well
	@Test
	void method1Test1()
	{
		List<Double> actual = Module04.method1(Arrays.asList(1.0, 2.0, 34.0, 54.0, 6.0, 7.0, 54.0, 30.4, 56.7,8.9));
		List<Double> expected = Arrays.asList(5.67, 5.4, 3.4, 3.04);
		assertEquals(expected, actual);
	}
	
	/**
	 * checks method with just one number and that number is less than 1 once it has been divided by 10
	 * in this case it the list will return empty because 0.1 is less than 1. 
	 */
	@Test
	void method1Test2()
	{
		List<Double> actual = Module04.method1(Arrays.asList(1.0));
		List<Double> expected = Arrays.asList();
		assertEquals(expected, actual);
	}
	
	/**
	 * Checks the method with a lot of random doubles as well as a few more duplicates
	 */
	@Test
	void method1Test3()
	{
		List<Double> actual = Module04.method1(Arrays.asList(54.0, 24.0, 39.0, 54.0, 68.0, 78.0, 54.0, 30.4, 56.7, 82.4));
		List<Double> expected = Arrays.asList(8.24, 7.8, 6.8, 5.67, 5.4, 3.9, 3.04, 2.4);
		assertEquals(expected, actual);
	}
	/**
	 * Checks method with first 7 numbers and then a few large numbers as well as one number over 10 characters in binary
	 */
	@Test
	void method2Test1()
	{
		List<String> actual = Module04.method2(Arrays.asList(1,2,3,4,5,6,7,201,513,510));
		List<String> expected = Arrays.asList("100", "101", "110", "111", "11001001", "111111110", "1", "10", "11");
		assertEquals(expected, actual);
	}
	/**
	 * Checks method with numbers that are all over 10 characters in binary
	 */
	@Test
	void method2Test2()
	{
		List<String> actual = Module04.method2(Arrays.asList(513,590,555));
		List<String> expected = Arrays.asList();
		assertEquals(expected, actual);
	}
	/**
	 * Again checks with random integers but none over 10 characters in binary
	 */
	@Test
	void method2Test3()
	{
		List<String> actual = Module04.method2(Arrays.asList(3,45,58,90,42,67,89));
		List<String> expected = Arrays.asList("1011010", "101010", "1000011", "1011001", "11", "101101", "111010");
		assertEquals(expected, actual);
	}
	/**
	 * Checks to see what method returns if no input is given.
	 * Return is also blank list. 
	 */
	@Test
	void method2Test4()
	{
		List<String> actual = Module04.method2(Arrays.asList());
		List<String> expected = Arrays.asList();
		assertEquals(expected, actual);
	}
	
}
