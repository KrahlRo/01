package de.doubleslash.models;

public class Converting {
	
	private String iso_8859_1, base64, decimal, hexadecimal, binary;
	
	public Converting () {
	}
	
	public Converting (String[] encodedInput) {
		setIso_8859_1(encodedInput[0]);
		setBase64(encodedInput[1]);
		setDecimal(encodedInput[2]);
		setHexadecimal(encodedInput[3]);
		setBinary(encodedInput[4]);
	}

	public String getIso_8859_1() {
		return iso_8859_1;
	}

	public void setIso_8859_1(String iso_8859_1) {
		this.iso_8859_1 = iso_8859_1;
	}

	public String getBase64() {
		return base64;
	}

	public void setBase64(String base64) {
		this.base64 = base64;
	}

	public String getDecimal() {
		return decimal;
	}

	public void setDecimal(String decimal) {
		this.decimal = decimal;
	}

	public String getHexadecimal() {
		return hexadecimal;
	}

	public void setHexadecimal(String hexadecimal) {
		this.hexadecimal = hexadecimal;
	}

	public String getBinary() {
		return binary;
	}

	public void setBinary(String binary) {
		this.binary = binary;
	}
}