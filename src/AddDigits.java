import java.util.HashMap;

/*
 *  Given a non-negative integer num, repeatedly add all its digits until the result has 
 *  only one digit.

For example:

Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it. 
 */
public class AddDigits {
	public static int addDigits(int num)
	{
		int sum = 0;
		while(num >= 10)
		{
			sum = sum + num%10;
			num = num/10;
		}
		sum = sum + num;
		if(sum < 10)
			return sum;
		else
			return addDigits(sum);
	}
	public static void main(String[] args)
	{
		int num = 12381;
		System.out.println(addDigits(num));
		System.out.println("Try:" + num % 9);
		 HashMap<Character, Integer> map = new HashMap<>();
	}
}
