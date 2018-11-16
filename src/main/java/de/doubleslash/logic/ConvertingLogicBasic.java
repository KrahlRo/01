package de.doubleslash.logic;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class ConvertingLogicBasic {

	private byte[] data;

	private ConvertingLogicBasic(byte[] data) {
		this.data = data;
	}

	public static ConvertingLogicBasic fromIso_8859_1String(String iso_8859_1String) {
		return new ConvertingLogicBasic(iso_8859_1String.getBytes(StandardCharsets.ISO_8859_1));
	}

	public static ConvertingLogicBasic fromBase64String(String base64String) {
		return new ConvertingLogicBasic(Base64.getDecoder().decode(base64String));
	}

	public static ConvertingLogicBasic fromDecimalString(String decimalString) {
		if (decimalString.isEmpty()) {	//corner case
			return new ConvertingLogicBasic(new byte[0]);
		}
		String[] parts = decimalString.split(",");
		byte[] bytes = new byte[parts.length];
		for (int i = 0; i < parts.length; i++) {
			bytes[i] = (byte) Integer.parseInt(parts[i]);
		}
		return new ConvertingLogicBasic(bytes);
	}

	public static ConvertingLogicBasic fromHexadecimalString(String hexadecimalString) {
		byte[] bytes = new byte[hexadecimalString.length() / 2];
		for (int i = 0; i < hexadecimalString.length() / 2; i++) {
			StringBuilder str = new StringBuilder();
			for (int j = 0; j < 2; j++) {
				str.append(String.valueOf(hexadecimalString.charAt(i * 2 + j)));
			}
			bytes[i] = (byte) Integer.parseInt(str.toString(), 16);
		}
		return new ConvertingLogicBasic(bytes);
	}

	public static ConvertingLogicBasic fromBinaryString(String binaryString) {
		byte[] bytes = new byte[binaryString.length() / 8];
		for (int i = 0; i < binaryString.length() / 8; i++) {
			StringBuilder str = new StringBuilder();
			for (int j = 0; j < 8; j++) {
				str.append(String.valueOf(binaryString.charAt(i * 8 + j)));
			}
			bytes[i] = (byte) Integer.parseInt(str.toString(), 2);
		}
		return new ConvertingLogicBasic(bytes);
	}

	public String toIso_8859_1String() {
		return new String(data, StandardCharsets.ISO_8859_1);
	}

	public String toBase64String() {
		return Base64.getEncoder().encodeToString(data);
	}

	public String toDecimalString() {
		StringBuilder str = new StringBuilder();
		for (byte part : data) {
			str.append(Integer.toString(part & 0xff)).append(",");
		}
		return str.toString().replaceAll(".$", "");
	}

	public String toHexadecimalString() {
		StringBuilder str = new StringBuilder();
		for (byte part : data) {
			str.append(String.format("%2s", Integer.toHexString(part & 0xff)).replace(' ', '0'));
		}
		return str.toString();
	}

	public String toBinaryString() {
		StringBuilder str = new StringBuilder();
		for (byte part : data) {
			str.append(String.format("%8s", Integer.toBinaryString(part & 0xff)).replace(' ', '0'));
		}
		return str.toString();
	}
}