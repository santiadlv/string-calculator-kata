package mx.tec.kata;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringCalculatorTest {

	StringCalculator calculator = new StringCalculator();

	@Test
	void givenCalculatorWhenAddEmptyStringThenZero() {
		int expectedResult = 0;
		String numbers = "";
		int actualResult = calculator.add(numbers);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void givenCalculatorWhenAddOneThenOne() {
		int expectedResult = 1;
		String numbers = "1";
		int actualResult = calculator.add(numbers);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void givenCalculatorWhenAddOneCommaTwoThenThree() {
		int expectedResult = 3;
		String numbers = "1,2";
		int actualResult = calculator.add(numbers);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void givenCalculatorWhenAdd1_3_5_7_9Then25() {
		int expectedResult = 25;
		String numbers = "1,3,5,7,9";
		int actualResult = calculator.add(numbers);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void givenCalculatorWhenAdd1Newline2Comma3Then6() {
		int expectedResult = 6;
		String numbers = "1\n2,3";
		int actualResult = calculator.add(numbers);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void givenCalculatorWhenAddDoubleSlashSemicolonNewlineOneSemicolonTwoThenThree() {
		int expectedResult = 3;
		String numbers = "//;\n1;2";
		int actualResult = calculator.add(numbers);
		
		assertEquals(expectedResult, actualResult);
	}
}
