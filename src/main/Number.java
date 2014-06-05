package main;

public class Number {

	private NumberFormat numberFormat;
	private String numberValue;

	public Number(String numberValue, NumberFormat numberFormat) {
		this.numberFormat = numberFormat;
		this.numberValue = numberValue;
	}

	public Number toOctal() {
		return convertTo(NumberFormat.OCTAL);
	}

	public Number toDecimal() {
		return convertTo(NumberFormat.DECIMAL);
	}

	public Number toHexa() {
		return convertTo(NumberFormat.HEXA);
	}

	private Number convertTo(NumberFormat targetFormat) {
		return convertBinaryToTarget(convertSourceToBinary(), targetFormat);
	}

	private Number convertBinaryToTarget(String numberValue,
			NumberFormat targetFormat) {
		int baseValue = targetFormat.baseValue();
		int value = Integer.parseInt(numberValue);
		int reminder = 0;
		String convertedNumber = "";

		for (; value > 0; value /= baseValue) {
			reminder = value % baseValue;
			convertedNumber = targetFormat.faceValueInOwnFormat(reminder)
					+ convertedNumber;
		}
		return new Number(convertedNumber, targetFormat);
	}

	private String convertSourceToBinary() {
		int baseValue = numberFormat.baseValue();
		int placeValue = 1;
		int faceValue = 0;
		int decimalEquivalent = 0;

		for (int i = numberValue.length() - 1; i >= 0; i--) {
			faceValue = numberFormat.faceValueInDecimal(numberValue.charAt(i));
			decimalEquivalent += placeValue * faceValue;
			placeValue *= baseValue;
		}
		return decimalEquivalent + "";
	}

	public String toString() {
		return numberValue + " " + numberFormat.toString();
	}
}
