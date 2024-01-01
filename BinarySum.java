package EF138;
import java.util.Scanner;
public class BinarySum
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first decimal number: ");
		int decimal1 = sc.nextInt();
		System.out.print("Enter the second decimal number: ");
		int decimal2 = sc.nextInt();
		String binary1 = decimalToBinary(decimal1);
		String binary2 = decimalToBinary(decimal2);
		System.out.println("Binary representation of " + decimal1 + ": " + binary1);
		System.out.println("Binary representation of " + decimal2 + ": " + binary2);
		String sumBinary = addBinary(binary1, binary2);
		System.out.println("\nSum of binary representations: " + sumBinary);
		sc.close();
	}
	public static String decimalToBinary(int decimal)
	{
		if (decimal == 0)
		{
			return "0";
		}
		StringBuilder binary = new StringBuilder();
		while (decimal > 0)
		{
			int remainder = decimal % 2;
			binary.insert(0, remainder);
			decimal = decimal / 2;
		}
		return binary.toString();
	}
	public static String addBinary(String binary1, String binary2)
	{
		StringBuilder result = new StringBuilder();
		int carry = 0;
		int i = binary1.length() - 1;
		int j = binary2.length() - 1;
		while (i >= 0 || j >= 0 || carry > 0)
		{
			int digit1 = i >= 0 ? binary1.charAt(i--) - '0' : 0;
			int digit2 = j >= 0 ? binary2.charAt(j--) - '0' : 0;
			int sum = digit1 + digit2 + carry;
			result.insert(0, sum % 2);
			carry = sum / 2;
		}
		return result.toString();
	}
}