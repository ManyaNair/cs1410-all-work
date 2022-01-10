package Module01TestFile;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import m01.Module01;
/**
 * 
 * @author manya
 * Test cases for Module01
 */
class Module01TestCases
{

	@Test
	void testWithTeacherEx1()
	{
		String expected = "<CSIS-2410>";
		String actual = Module01.transform("Cs 2410");
		assertEquals(expected, actual);
	}
	@Test
	void testWithTeacherEx2()
	{
		String expected = "<<CSIS-1410>>";
		String actual = Module01.transform("<cs 1410>");
		assertEquals(expected, actual);
	}
	@Test
	void testWithTeacherEx3()
	{
		String expected = "<CSISco_sale>";
		String actual = Module01.transform("Cisco_sale");
		assertEquals(expected, actual);
	}
	@Test
	void testWithTeacherEx4()
	{
		String expected = "<CSIS-2410>";
		String actual = Module01.transform("cSiS 2410");
		assertEquals(expected, actual);
	}
	@Test
	void testWithTeacherEx5()
	{
		String expected = "<CSISs-1430>";
		String actual = Module01.transform("css 1430");
		assertEquals(expected, actual);
	}
	@Test
	void testWithTeacherEx6()
	{
		String expected = "<no--mikes>";
		String actual = Module01.transform("no  mikes");
		assertEquals(expected, actual);
	}
	@Test
	void testWithTeacherEx7()
	{
		String expected = "<salt-lake-city>";
		String actual = Module01.transform("Salt Lake City");
		assertEquals(expected, actual);
	}
	@Test
	void testWithEmptyString()
	{
		String expected = "<>";
		String actual = Module01.transform("");
		assertEquals(expected, actual);
	}
	@Test
	void testWithJustASpace()
	{
		String expected = "<->";
		String actual = Module01.transform(" ");
		assertEquals(expected, actual);
	}
	@Test
	void testWithNumbers()
	{
		String expected = "<1-2-3>";
		String actual = Module01.transform("1 2 3");
		assertEquals(expected, actual);
	}
	
}
