/*
 * Given an integer, write a function to determine if it is a power of two. 
 */
public class PowerOfTwo {
	public static boolean isPowerOfTwo(int n) {
        if (n == 1)
            return true;
        if (n%2 != 0 || n == 0)
            return false;
        return isPowerOfTwo(n/2);
    }
	public static boolean isPowerOfTwo2(int n) {
        if (n == 1)
            return true;
        if (n%2 != 0 || n == 0)
            return false;
        return isPowerOfTwo2(n>>2);
    }


}
