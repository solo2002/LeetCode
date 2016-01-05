/*
 * Given a positive integer, return its corresponding column title as appear in 
 * an Excel sheet.

For example:

    1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB 
 */
public class ExcelSheetColumnTile {
	public static String convert(int n)
	{
		 StringBuilder sb = new StringBuilder();
		    while (n > 0){
		        int r = n % 26;
		        n = n/26;
		        if (r != 0){
		            sb.append((char)(r - 1 + 'A'));
		        } else {
		            sb.append('Z');
		            n--;
		        }

		    }
		    return sb.reverse().toString();
		/* char c;
        if (n <= 0)
            return "Error number n";
        if (n <= 26)
        {
            c = (char) ('A' + n - 1);
            return "" + c;
        }
	    int b = n/26;
	    StringBuffer sb = new StringBuffer();
	    if (n%26 == 0)
	    {
	    	for(int i = 1; i < b; i++)
		    	sb.append('A');
	    	sb.append('Z');
	    }
	    else
	    {
		    for(int i = 0; i < b; i++)
		    	sb.append('A');
		    sb.append((char)('A'+ n%26 - 1));
	    }
	    return sb.toString();*/
	        //return "A" + convert(n - 26);
	}
	public static void main(String[] args)
	{
		System.out.println(convert(53));
	}
}
