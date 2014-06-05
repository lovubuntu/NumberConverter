package test;

import junit.framework.Assert;
import main.NumberFormat;
import main.Number;

import org.junit.Test;

public class NumberTest {

	@Test
	public void testOctalToHexa() {
		Number octalNumber = new Number("55", NumberFormat.OCTAL);
		Number hexaNumber = octalNumber.toHexa();
		Assert.assertEquals("Conversion Error", "2D Hexa",
				hexaNumber.toString());
	}

	@Test
	public void testHexaToOctal() {
		Number hexaNumber = new Number("2D", NumberFormat.HEXA);
		Number octalNumber = hexaNumber.toOctal();
		Assert.assertEquals("Conversion Error", "55 Octal",
				octalNumber.toString());
	}

	@Test
	public void testDecimalToDecimal() {
		Number decimalNumber = new Number("45", NumberFormat.DECIMAL);
		Number decimalNumberAgain = decimalNumber.toDecimal();
		Assert.assertEquals("Conversion Error", "45 Decimal",
				decimalNumberAgain.toString());
	}
}
