/*
 * Implement atoi to convert a string to an integer.

Hint: Carefully consider all possible input cases. If you want a challenge, please do not see below 
and ask yourself what are the possible input cases.
 */
public class StrToInt {
  public int myAtoi(String str) {
    if (str == null || str.length() == 0)
        return 0;
    String s = str.trim();//remove all leading white space and trailing white space
    if (s.length() == 0) return 0;//nothing left after remove white space
    long sum = 0;
    int sign = 1;
    int start = 0;
    if (s.charAt(0) == '+')
    {
        sign = 1;
        start++;
    }
    else if (s.charAt(0) == '-' )
    {
        sign = -1;
        start++;
    }
    
    for (int i = start; i < s.length(); i++)
    {
    	if (s.charAt(i) < '0' || s.charAt(i) > '9')// not a valid number
        return (int) sum * sign;
    	sum = sum * 10 + (s.charAt(i) - '0');
    	if (sign == 1 && sum > Integer.MAX_VALUE)
        return Integer.MAX_VALUE;
    	if (sign == -1 && sum * (-1) < Integer.MIN_VALUE)
    		return Integer.MIN_VALUE;
    }
      return (int) sum * sign;
    	
}
  public static void main(String[] args)
  {
  	System.out.print('6' < '0');
  }
}
