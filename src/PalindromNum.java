/*
 * Determine whether an integer is a palindrome. 
 * For instance, 121, 127721, 12721
 */
public class PalindromNum {
	public static boolean isPalindrome(int x)
	{//we reverse the number and then compare the value
		//121 is equal to the number after reversed
		if (x == 0)
			return true;
		if (x < 0)
			return false;
		int num = x;
		int revNum = 0;
		while (num != 0)
		{
			revNum = revNum * 10 + num % 10;
			num = num / 10;
		}
		return revNum == x;
	}
	public static void main(String[] args)
	{
		System.out.println(isPalindrome(101));
	}
}
