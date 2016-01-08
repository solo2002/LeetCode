/*
 * Reverse digits of an integer.

Example1: x = 123, return 321
Example2: x = -123, return -321
 */
public class ReverseInteger {
	public int reverse(int x) {
    if (x == 0)
        return x;
    long rev = 0;
    int d = 0;
    
    while (x != 0)
    {
        d = x % 10;
        rev = rev * 10 + d;
        x = x / 10;
    }
    if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE)
    	return 0;
    return (int) rev;
   
}
	public static void main(String[] args)
	{
		System.out.print((-123) % 10);
	}
}
