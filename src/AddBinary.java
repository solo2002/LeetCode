/*
 * Given two binary strings, return their sum (also a binary string).

For example,
a = "11"
b = "1"
Return "100".
 */
public class AddBinary {
	public static String addBinary(String a, String b)
	{
		long numA = Integer.parseInt(a, 2);
		long numB = Integer.parseInt(b, 2);
		long sum = numA + numB;
		return Integer.toBinaryString((int)sum);
			
	}
	public static void main(String[] args)
	{
		System.out.println(addBinary("11", "1"));
	}
}
