
public class zap3 {
 public static int numOfP(String s)
 {
	 int result = 0;
	 int len = s.length();
	 for(int i = 0; i < len/2; i++)
	 {
		 result += Math.abs(s.charAt(len - i - 1) - s.charAt(i));
	 }
	 return result;
 }
 public static void main(String[] args)
 {
	 System.out.print(numOfP("abcd"));
 }
}
