
//2.38pm
package test;

import static org.junit.Assert.*;

import org.junit.Test;

import StringCalculatorKata.StringCalculator;

public class StringCalculatorTest {
	StringCalculator str = new StringCalculator();

	@Test
	public void testforEmptyString() {
		assertEquals(0, str.StrCalc(""));
	}

	@Test
	public void testForSingleNumberString() {
		assertEquals(5, str.StrCalc("5"));

	}

	@Test
	public void testForTwoNumberString() {
		assertEquals(8, str.StrCalc("5,3"));
	}

	@Test
	public void testForMultipleNumberString() {
		assertEquals(11, str.StrCalc("5,3,2,1"));
	}

	@Test
	public void testFornewLineDelimiter() {
		assertEquals(11, str.StrCalc("5\n3,2,1"));
	}

	@Test
	public void testForDilimitersAtStartOfString() {
		assertEquals(11, str.StrCalc("//;\n5;3;2;1"));
	}

}
