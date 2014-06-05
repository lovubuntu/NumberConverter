package main;

public class HexaFormat implements NumberFormat {

	@Override
	public int baseValue() {
		return 16;
	}

	@Override
	public int faceValueInDecimal(char c) {
		switch (c) {
		case 'A':
			return 10;
		case 'B':
			return 11;
		case 'C':
			return 12;
		case 'D':
			return 13;
		case 'E':
			return 14;
		case 'F':
			return 15;

		default:
			return Character.getNumericValue(c);
		}
	}

	@Override
	public char faceValueInOwnFormat(int i) {
		switch (i) {
		case 10:
			return 'A';
		case 11:
			return 'B';
		case 12:
			return 'C';
		case 13:
			return 'D';
		case 14:
			return 'E';
		case 15:
			return 'F';

		default:
			return Character.forDigit(i, 10);
		}
	}

	@Override
	public String toString() {
		return "Hexa";
	}

}
