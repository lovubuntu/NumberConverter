package main;

public interface NumberFormat {

	public static OctalFormat OCTAL = new OctalFormat();
	public static DecimalFormat DECIMAL = new DecimalFormat();
	public static HexaFormat HEXA = new HexaFormat();

	public int baseValue();

	public int faceValueInDecimal(char c);

	public char faceValueInOwnFormat(int i);
}
