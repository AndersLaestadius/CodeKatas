package se.laestadius.stringcalculator;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

import org.junit.Assert;
import org.junit.Test;
 
public class StringCalculatorTest {

	private final StringCalculator calculator = new StringCalculator();
	
	@Test
	public void emptyStringShouldAddTo_0() {
		assertThat(calculator.add(""), is(0));
	}
}
