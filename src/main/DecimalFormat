package main;

public class DecimalFormat implements NumberFormat {

	@Override
	public int baseValue() {
		return 10;
	}

	@Override
	public String toString() {
		return "Decimal";
	}

	@Override
	public int faceValueInDecimal(char c) {
		return Character.getNumericValue(c);
	}

	@Override
	public char faceValueInOwnFormat(int i) {
		return Character.forDigit(i, 10);
	}

}
