package de.doubleslash.logic;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;

class ConvertingLogicBasicTest {

	@Nested
	class ConvertingIso_8859_1 {

		String toBeTestedString = "AÄ";
		ConvertingLogicBasic convertingLogicBasic = ConvertingLogicBasic.fromIso_8859_1String(toBeTestedString);
		
		@Test
		void convertingIso_8859_1ToIso_8859_1 () {
		String toBeExpectedString = "AÄ";
		Assertions.assertEquals(toBeExpectedString, convertingLogicBasic.toIso_8859_1String());
		}

		@Test
		void convertingIso_8859_1ToBase64 () {
		String toBeExpectedString = "QcQ=";
		Assertions.assertEquals(toBeExpectedString, convertingLogicBasic.toBase64String());
		}

		@Test
		void convertingIso_8859_1ToDecimal () {
		String toBeExpectedString = "65,196";
		Assertions.assertEquals(toBeExpectedString, convertingLogicBasic.toDecimalString());
		}

		@Test
		void convertingIso_8859_1ToHexadecimal () {
		String toBeExpectedString = "41c4";
		Assertions.assertEquals(toBeExpectedString, convertingLogicBasic.toHexadecimalString());
		}

		@Test
		void convertingIso_8859_1ToBinary () {
		String toBeExpectedString = "0100000111000100";
		Assertions.assertEquals(toBeExpectedString, convertingLogicBasic.toBinaryString());
		}
	}
	
	@Nested
	class ConvertingBase64 {
		
		String toBeTestedString = "QcQ=";
		ConvertingLogicBasic convertingLogicBasic = ConvertingLogicBasic.fromBase64String(toBeTestedString);
		
		@Test
		void convertingBase64ToIso_8859_1 () {
			String toBeExpectedString = "AÄ";
			Assertions.assertEquals(toBeExpectedString, convertingLogicBasic.toIso_8859_1String());
		}

		@Test
		void convertingBase64ToBase64 () {
			String toBeExpectedString = "QcQ=";
			Assertions.assertEquals(toBeExpectedString, convertingLogicBasic.toBase64String());
		}

		@Test
		void convertingBase64ToDecimal () {
			String toBeExpectedString = "65,196";
			Assertions.assertEquals(toBeExpectedString, convertingLogicBasic.toDecimalString());
		}

		@Test
		void convertingBase64ToHexadecimal () {
			String toBeExpectedString = "41c4";
			Assertions.assertEquals(toBeExpectedString, convertingLogicBasic.toHexadecimalString());
		}

		@Test
		void convertingBase64ToBinary () {
			String toBeExpectedString = "0100000111000100";
			Assertions.assertEquals(toBeExpectedString, convertingLogicBasic.toBinaryString());
		}
	}
	
	@Nested
	class ConvertingDecimal {
	
		String toBeTestedString = "65,196";
		ConvertingLogicBasic convertingLogicBasic = ConvertingLogicBasic.fromDecimalString(toBeTestedString);
		
		@Test
		void convertingDecimalToIso_8859_1 () {
			String toBeExpectedString = "AÄ";
			Assertions.assertEquals(toBeExpectedString, convertingLogicBasic.toIso_8859_1String());
		}

		@Test
		void convertingDecimalToBase64 () {
			String toBeExpectedString = "QcQ=";
			Assertions.assertEquals(toBeExpectedString, convertingLogicBasic.toBase64String());
		}

		@Test
		void convertingDecimalToDecimal () {
			String toBeExpectedString = "65,196";
			Assertions.assertEquals(toBeExpectedString, convertingLogicBasic.toDecimalString());
		}

		@Test
		void convertingDecimalToHexadecimal () {
			String toBeExpectedString = "41c4";
			Assertions.assertEquals(toBeExpectedString, convertingLogicBasic.toHexadecimalString());
		}

		@Test
		void convertingDecimalToBinary () {
			String toBeExpectedString = "0100000111000100";
			Assertions.assertEquals(toBeExpectedString, convertingLogicBasic.toBinaryString());
		}

	}
	
	@Nested
	class ConvertingHexadecimal {
		
		String toBeTestedString = "41c4";
		ConvertingLogicBasic convertingLogicBasic = ConvertingLogicBasic.fromHexadecimalString(toBeTestedString);

		@Test
		void convertingHexadecimalToIso_8859_1 () {
			String toBeExpectedString = "AÄ";
			Assertions.assertEquals(toBeExpectedString, convertingLogicBasic.toIso_8859_1String());
		}
	
		@Test
		void convertingHexadecimalToBase64 () {
			String toBeExpectedString = "QcQ=";
			Assertions.assertEquals(toBeExpectedString, convertingLogicBasic.toBase64String());
		}
	
		@Test
		void convertingHexadecimalToDecimal () {
			String toBeExpectedString = "65,196";
			Assertions.assertEquals(toBeExpectedString, convertingLogicBasic.toDecimalString());
		}
	
		@Test
		void convertingHexadecimalToHexadecimal () {
			String toBeExpectedString = "41c4";
			Assertions.assertEquals(toBeExpectedString, convertingLogicBasic.toHexadecimalString());
		}

		@Test
		void convertingHexadecimalToBinary () {
			String toBeExpectedString = "0100000111000100";
			Assertions.assertEquals(toBeExpectedString, convertingLogicBasic.toBinaryString());
		}
	}
	
	@Nested
	class ConvertingBinary {
		
		String toBeTestedString = "0100000111000100";
		ConvertingLogicBasic convertingLogicBasic = ConvertingLogicBasic.fromBinaryString(toBeTestedString);
		
		@Test
		void convertingBinaryToIso_8859_1 () {
			String toBeExpectedString = "AÄ";
			Assertions.assertEquals(toBeExpectedString, convertingLogicBasic.toIso_8859_1String());
		}
	
		@Test
		void convertingBinaryToBase64 () {
			String toBeExpectedString = "QcQ=";
			Assertions.assertEquals(toBeExpectedString, convertingLogicBasic.toBase64String());
		}
	
		@Test
		void convertingBinaryToDecimal () {
			String toBeExpectedString = "65,196";
			Assertions.assertEquals(toBeExpectedString, convertingLogicBasic.toDecimalString());
		}
	
		@Test
		void convertingBinaryToHexadecimal () {
			String toBeExpectedString = "41c4";
			Assertions.assertEquals(toBeExpectedString, convertingLogicBasic.toHexadecimalString());
		}
	
		@Test
		void convertingBinaryToBinary () {
			String toBeExpectedString = "0100000111000100";
			Assertions.assertEquals(toBeExpectedString, convertingLogicBasic.toBinaryString());
		}
	}
}