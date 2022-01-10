package codingBat;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CodingBatTest
{
	@Test
	void testThatMethodPrintsCharacterBeforeAndAfterWithMultipleXY()
	{
		String expected = "c13i";
		String actual = CodingBat.wordEnds("abcXY123XYijk", "XY");
		assertEquals(expected, actual);
	}
	@Test
	void testThatMethodPrintsCharacterBeforeAndAfterWithOnlyTwoXY()
	{
		String expected = "13";
		String actual = CodingBat.wordEnds("XY123XY", "XY");
		assertEquals(expected, actual);
	}
	@Test
	void testThatMethodPrintsCharacterBeforeAndAfterWithTwoXYAndOneCharacterBetween()
	{
		String expected = "11";
		String actual = CodingBat.wordEnds("XY1XY", "XY");
		assertEquals(expected, actual);
	}
	@Test
	void testThatMethodPrintsCharacterBeforeAndAfterWithOneXY()
	{
		String expected = "";
		String actual = CodingBat.wordEnds("XY", "XY");
		assertEquals(expected, actual);
	}
	@Test
	void testThatMethodPrintsCharacterBeforeAndAfterWithHi()
	{
		String expected = "";
		String actual = CodingBat.wordEnds("Hi", "XY");
		assertEquals(expected, actual);
	}
	@Test
	void testThatMethodPrintsCharacterBeforeAndAfterWithNothing()
	{
		String expected = "";
		String actual = CodingBat.wordEnds("", "XY");
		assertEquals(expected, actual);
	}
	@Test
	void testThatMethodPrintsCharacterBeforeAndAfterWithNumberAsChar()
	{
		String expected = "cxziij";
		String actual = CodingBat.wordEnds("abc1xyz1i1j", "1");
		assertEquals(expected, actual);
	}
	void testThatMethodPrintsCharacterBeforeAndAfterWithNumberAsCharTest2()
	{
		String expected = "cxz";
		String actual = CodingBat.wordEnds("abc1xyz1", "1");
		assertEquals(expected, actual);
	}
	@Test
	void testThatMethodPrintsCharacterBeforeAndAfterWithNumberAsCharTest3()
	{
		String expected = "cxz11";
		String actual = CodingBat.wordEnds("abc1xyz11", "1");
		assertEquals(expected, actual);
	}
	void testThatMethodPrintsCharacterBeforeAndAfterWithABC()
	{
		String expected = "11";
		String actual = CodingBat.wordEnds("abc1xyz1abc", "abc");
		assertEquals(expected, actual);
	}
	@Test
	void testThatMethodPrintsCharacterBeforeAndAfterWithB()
	{
		String expected = "acac";
		String actual = CodingBat.wordEnds("abc1xyz1abc", "b");
		assertEquals(expected, actual);
	}
	@Test
	void testThatMethodPrintsCharacterBeforeAndAfterWithABCTest2()
	{
		String expected = "1111";
		String actual = CodingBat.wordEnds("abc1abc1abc", "abc");
		assertEquals(expected, actual);
	}
}

