/*
 *  Given a non-negative integer num, repeatedly add all its digits until the result has 
 *  only one digit.

For example:

Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it. 
 */
public class AddDigits {
	public static int addDigits(int num)
	{
		if (num < 10)
			return num;
		int add = 0;
		int a = num%10;
		while (num >= 10)
		{
			add += (num/10)%10;
			num = num/10;
		}
		add += a;
		if (add < 10)
			return add;
		return addDigits(add);
	}
	public static void main(String[] args)
	{
		int num = 12381;
		System.out.println(addDigits(num));
	}
}
