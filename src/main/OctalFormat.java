package main;

public class OctalFormat implements NumberFormat {

	@Override
	public int baseValue() {
		return 8;
	}

	@Override
	public String toString() {
		return "Octal";
	}

	@Override
	public int faceValueInDecimal(char c) {
		return Character.getNumericValue(c);
	}

	@Override
	public char faceValueInOwnFormat(int i) {
		return Character.forDigit(i, 8);
	}
}
