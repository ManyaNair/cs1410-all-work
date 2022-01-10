package collections;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
 
class GenericCollectionsTest
{

	@Test
	void teacherExample1()
	{
		List<String> actualValue = GenericCollections.lettersAndNumbers(
				Arrays.asList('?', 'a', 'B', 'c', '5', 'd', 'E', 'F', 'g', '%', '#', 'H'));
		String actual = actualValue.toString();
		String expected = "[U(h), L(g), U(f), U(e), L(d), N(5), L(c), U(b), L(a)]";
		assertEquals(expected, actual);
	}
	@Test
	void teacherExample2()
	{
		List<String> actualValue = GenericCollections.lettersAndNumbers(
				Arrays.asList('1', '*', '2', '+', '3', '-', '4'));
		String actual = actualValue.toString();
		String expected = "[N(4), N(3), N(2), N(1)]";
		assertEquals(expected, actual);
	}
	@Test
	void teacherExample3()
	{
		List<String> actualValue = GenericCollections.lettersAndNumbers(
				Arrays.asList('?', '#', '@'));
		String actual = actualValue.toString();
		String expected = "[]";
		assertEquals(expected, actual);
	}
	@Test
	void teacherExample4()
	{
		List<String> actualValue = GenericCollections.lettersAndNumbers(
				Arrays.asList(' '));
		String actual = actualValue.toString();
		String expected = "[]";
		assertEquals(expected, actual);
	}
	
	@Test
	void NandLtest1Number()
	{
		List<String> actualValue = GenericCollections.lettersAndNumbers(
				Arrays.asList('0'));
		String actual = actualValue.toString();
		String expected = "[N(0)]";
		assertEquals(expected, actual);
	}
	@Test
	void NandLtest1Lowercaseletter()
	{
		List<String> actualValue = GenericCollections.lettersAndNumbers(
				Arrays.asList('a'));
		String actual = actualValue.toString();
		String expected = "[L(a)]";
		assertEquals(expected, actual);
	}
	@Test
	void NandLtest1Uppercaseletter()
	{
		List<String> actualValue = GenericCollections.lettersAndNumbers(
				Arrays.asList('F'));
		String actual = actualValue.toString();
		String expected = "[U(f)]";
		assertEquals(expected, actual);
	}
	@Test
	void NandLtestJumble()
	{
		List<String> actualValue = GenericCollections.lettersAndNumbers(
				Arrays.asList('F','r', 'k','L','U','z'));
		String actual = actualValue.toString();
		String expected = "[L(z), U(u), U(l), L(k), L(r), U(f)]";
		assertEquals(expected, actual);
	}
	
	
	//modify tests
	@Test
	void modify_listIsNull() 
	{
		assertThrows(NullPointerException.class, () -> 
		{
			GenericCollections.modify(null);
		});
	}
	
	@Test
	void modify_multiplesOfThree()
	{
		List<Integer> actual = new ArrayList<>();
			actual.add(-3);
			actual.add(0);
			actual.add(27);
		assertEquals(13, GenericCollections.modify(actual));
	}
	
	@Test
	void modify_emptyList() 
	{
		List<Integer> actual = new ArrayList<>();
		assertThrows(NullPointerException.class, () -> 
		{
			GenericCollections.modify(actual);
		});
	}
	
	@Test
	void modify_noMultiplesOfThree() 
	{
		List<Integer> actual = new ArrayList<>();
			actual.add(1);
			actual.add(2);
		assertEquals(15, GenericCollections.modify(actual));
	}
	
	@Test
	void modify_duplicates()
	{
		List<Integer> actual = new ArrayList<>();
			actual.add(4);
			actual.add(5);
			actual.add(6);
			actual.add(8);
			actual.add(10);
			actual.add(12);
			actual.add(12);
			actual.add(15);
			actual.add(16);
			actual.add(18);
			actual.add(20);
			actual.add(20);
			actual.add(24);
			actual.add(25);
			actual.add(30);
		assertEquals(13, GenericCollections.modify(actual));
	}
	
	@Test
	void modify_ascendingOrder()
	{
		List<Integer> actual = new ArrayList<>();
			actual.add(-100);
			actual.add(-151);
			actual.add(-150);
			actual.add(151);
			actual.add(100);
		assertEquals(17, GenericCollections.modify(actual));
	}
	
	@Test
	void modify_nullInList() 
	{
		List<Integer> actual = new ArrayList<>();
		actual.add(null);
		assertThrows(NullPointerException.class, () -> {
			GenericCollections.modify(null);
		});
	}
	
	@Test
	void modify_largeNumbers() 
	{
		List<Integer> actual = new ArrayList<>();
			actual.add(2187);
			actual.add(2186);
			actual.add(-2190);
			actual.add(-2189);
		
		assertEquals(15, GenericCollections.modify(actual));
	}
	@Test
	void removeEveryNthElement_nEqualsZero() {
		List<?> actual = new ArrayList<>();
		assertThrows(NullPointerException.class, () -> {
			GenericCollections.removeEveryNthElement(actual, 0);
		});
	}
	
	@Test
	void removeEveryNthElement_nIsNegative() {
		List<?> actual = new ArrayList<>();
		assertThrows(NullPointerException.class, () -> {
			GenericCollections.removeEveryNthElement(actual, -420);
		});
	}
	
	@Test
	void removeEveryNthElement_listIsNull() {
		List<?> actual = null;
		assertThrows(NullPointerException.class, () -> {
			GenericCollections.removeEveryNthElement(actual, 1);
		});
	}
	
	@Test
	void removeEveryNthElement_nIsGreaterThanList() {
		List<Integer> actual = new ArrayList<>();
			actual.add(1);
			actual.add(7);
		List<Integer> expected = new ArrayList<>();
			expected.add(1);
			expected.add(7);
		GenericCollections.removeEveryNthElement(actual, 2);
		assertEquals("[1]", actual.toString());
	}
	
	@Test
	void removeEveryNthElement_multipleNthElements() {
		List<String> actual = new ArrayList<>();
			actual.add("aa");
			actual.add("7");
			actual.add("eri");
			actual.add("sgdjr");
			actual.add("yikes");
		List<String> expected = new ArrayList<>();
			expected.add("aa");
			expected.add("eri");
			expected.add("yikes");
		GenericCollections.removeEveryNthElement(actual, 3);
		assertEquals("[aa, 7, sgdjr, yikes]", actual.toString());
	}
	
	@Test
	void removeEveryNthElement_nIsOne() {
		List<Character> actual = new ArrayList<>();
			actual.add('a');
			actual.add('7');
			actual.add('9');
			actual.add('$');
			actual.add('*');
		List<Character> expected = new ArrayList<>();
		GenericCollections.removeEveryNthElement(actual, 1);
		assertEquals("[7, 9, $, *]", actual.toString());
	}
	
	@Test
	void removeEveryNthElement_listIsEmpty() {
		List<Boolean> actual = new ArrayList<>();
		List<Boolean> expected = new ArrayList<>();
		assertThrows(NullPointerException.class, () -> 
		{
			GenericCollections.removeEveryNthElement(actual,8);
		});
	}
	
	@Test
	void removeEveryNthElement_nullInList() {
		List<Integer> actual = new ArrayList<>();
			actual.add(null);
			actual.add(8);
			actual.add(9);
			actual.add(5);
		GenericCollections.removeEveryNthElement(actual, 3);
	}

}
