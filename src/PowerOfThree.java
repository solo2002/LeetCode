/*
 * Given an integer, write a function to determine if it is a power of three.

Follow up:
Could you do it without using any loop / recursion?
 */
public class PowerOfThree {
	public static boolean isPowerOfThree(int n) {
    if (n <= 0)
        return false;
    if (n == 1)
        return true;
    int mod = 0;
    while (n > 1)
    {
        mod = n % 3;
        if (mod != 0)
            return false;
        n = n/3;
    }
    return true;
 }
	public static boolean isPowerOfThree2(int n)
	{
		 if (n <= 0)
       return false;
		 if (n == 1)
       return true;
		 if (n % 3 != 0)
			 return false;
		 return isPowerOfThree2(n/3);
	}
	public static boolean isPowerOfThree3(int n)
	{//without loop and recursion
		if(n <= 0)
			return false;
		double r = Math.log10(n) / Math.log10(3);
		if (r % 1 == 0)
			return true;
		return false;
		
	}
	
	public static void main(String[] args)
	{
		System.out.print(isPowerOfThree(48) + "  " + isPowerOfThree2(48));
	}
}
