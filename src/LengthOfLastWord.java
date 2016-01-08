/*Given a string s consists of upper/lower-case alphabets and empty space characters ' ', 
 * return the length of last word in the string.

If the last word does not exist, return 0.

Note: A word is defined as a character sequence consists of non-space characters only.

For example, 
Given s = "Hello World",
return 5.
 * 
 */
public class LengthOfLastWord {
	public static int lengthOfLastWord(String s)
	{
		if (s == null || s.equals(" ") || s.equals(""))
			return 0;
		int counter = 0;
		char[] a = s.toCharArray();
		for (char c : a)
			System.out.println(c);
		int j = a.length - 1;
		while (j >= 0 && a[j] == ' ')
			j--;
		for (int i = j; i >= 0; i--)
		{
			if (a[i] == ' ')
				return counter;
			counter++;
		}
		return counter;
	}
	public static void main(String[] args)
	{
		System.out.println(lengthOfLastWord("  "));
	}
}
