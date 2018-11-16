package de.doubleslash.logic;

public class ConvertingLogicCombined {
	
    public static String[] convertingCombined (String formatOrigin, String input) {
    	String[] formats = new String[]{"iso_8859_1", "base64", "decimal", "hexadecimal", "binary"};
    	ConvertingLogicBasic convertingLogicBasic = null;
    	if (formatOrigin.equals(formats[0])) {
    		convertingLogicBasic = ConvertingLogicBasic.fromIso_8859_1String(input);
    	} else if (formatOrigin.equals(formats[1])) {
    		convertingLogicBasic = ConvertingLogicBasic.fromBase64String(input);
    	} else if (formatOrigin.equals(formats[2])) {
    		convertingLogicBasic = ConvertingLogicBasic.fromDecimalString(input);
    	} else if (formatOrigin.equals(formats[3])) {
    		convertingLogicBasic = ConvertingLogicBasic.fromHexadecimalString(input);
    	} else if (formatOrigin.equals(formats[4])) {
    		convertingLogicBasic = ConvertingLogicBasic.fromBinaryString(input);
    	}
    	String[] encodedInput = new String[5];
    	encodedInput[0] = convertingLogicBasic.toIso_8859_1String();
    	encodedInput[1] = convertingLogicBasic.toBase64String();
    	encodedInput[2] = convertingLogicBasic.toDecimalString();
    	encodedInput[3] = convertingLogicBasic.toHexadecimalString();
    	encodedInput[4] = convertingLogicBasic.toBinaryString();
    	return encodedInput;
    }
}