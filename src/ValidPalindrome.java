/*
 *  Given a string, determine if it is a palindrome, considering only alphanumeric characters 
 *  and ignoring cases.

For example,
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome. 
 */
public class ValidPalindrome {
	public static boolean isPalindrome(String s)
	{//Time O(n), space O(1)
		for (int i = 0, j = s.length()-1; i < j; i++, j--)
		{
			char a = s.charAt(i);
			char z = s.charAt(j);
			while (i < j && !Character.isLetter(a) && !Character.isDigit(a))//not alphanumeric
				a = s.charAt(++i);
			while (j > i && !Character.isLetter(z) && !Character.isDigit(z))
				z = s.charAt(--j);
			if (Character.toLowerCase(a) != Character.toLowerCase(z))
				return false;
		}
		return true;
	}
	public static void main(String[] args)
	{
		String s = "la2";
		System.out.println(isPalindrome(s));
	}

}
