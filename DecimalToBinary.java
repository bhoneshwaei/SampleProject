
//Count a number from decimal to binary
package project1;

public class DecimalToBinary {

	public static void main(String[] args) {
		int decimalNumber = 478;
		String binaryRepresentation = decimalToBinary(decimalNumber);
		System.out.println("Decimal number:"+decimalNumber);
		System.out.println("Binary repsentation:" +binaryRepresentation);

	}
	public static String decimalToBinary(int decimal)
	{
		if(decimal == 0)
		{
			return "0";
					
		}
		StringBuilder binary = new StringBuilder();
		while(decimal>0)
		{
			int remainder = decimal%2;
			binary.insert(0,remainder);
			decimal/=2;
		}
		return binary.toString();		
	}

}
