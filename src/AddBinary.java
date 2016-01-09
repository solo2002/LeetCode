/*
 * Given two binary strings, return their sum (also a binary string).

For example,
a = "11"
b = "1"
Return "100".
 */
public class AddBinary {
	public static String addBinary(String a, String b)
	{
		 if (a == null || a.length() == 0) return b;
     if (b == null || b.length() == 0) return a;
     int carry = 0;
     StringBuilder sb = new StringBuilder();
     int lenA = a.length() - 1;
     int lenB = b.length() - 1;
     while (lenA >= 0 || lenB >= 0)
     {
    	 int va = 0;
    	 int vb = 0;
    	 if (lenA >= 0)
    	 {
    		 if (a.charAt(lenA) == '0')
    			 va = 0;
    		 else
    			 va = 1;
    		 lenA--;
    	 }
    	 if (lenB >= 0)
    	 {
    		 if (b.charAt(lenB) == '0')
    			 vb = 0;
    		 else
    			 vb = 1;
    		 lenB--;
    	 }
    	 int sum = va + vb + carry;
    	 if (sum >= 2)
    	 {
    		 sb.append(String.valueOf(sum - 2));
    		 carry = 1;
    	 }
    	 else
    	 {
    		 sb.append(String.valueOf(sum));
    		 carry = 0;
    	 }
    	
     }
     if (carry == 1)
    	 sb.append('1');
    
     return sb.reverse().toString();
     
		/*long numA = Integer.parseInt(a, 2);
		long numB = Integer.parseInt(b, 2);
		long sum = numA + numB;
		return Integer.toBinaryString((int)sum);*/
			
	}
	public static void main(String[] args)
	{
		System.out.println(addBinary("11", "1"));
	}
}
