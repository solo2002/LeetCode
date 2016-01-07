/*
 * Given an integer n, return the number of trailing zeroes in n!.

Note: Your solution should be in logarithmic time complexity.
 */
//There is a formula from wiki
//https://upload.wikimedia.org/math/b/a/4/ba407ce5567558a041a1f8760473aebd.png
public class TrailingZero {
	public int trailingZero (int n)
	{
		int sum = 0;
		int m = n;
		while (m >= 1)
		{
			m = m/5;
			sum += m;
		}
		return sum;
	}

}
