/*
 * The count-and-say sequence is the sequence of integers beginning as follows:
1, 11, 21, 1211, 111221, ...

1 is read off as "one 1" or 11.
11 is read off as "two 1s" or 21.
21 is read off as "one 2, then one 1" or 1211.
111 is read off as 31
2222 is read off as 42
Given an integer n, generate the nth sequence.

Note: The sequence of integers will be represented as a string.
 */
public class CountAndSay {
	public static String countAndSay(int n)
	{
		if (n <= 0)
			return "0";
		String[] result = new String[n + 1];
		for (int i = 2; i < n+1; i++)
			result[i] = "";//initialize the array
		result[0] = "0";
		result[1] = "1";
		for (int i = 2; i <= n; i++)
		{
			String s = result[i-1];
			for (int j = 0; j < s.length(); )
			{
				char a = s.charAt(j);
				switch (a)
				{
				case '0': 
		    {
				    int counter = count(s, '0', j);
					result[i] = result[i] + String.valueOf(counter) + "0";
					j = j + counter;
					break;
		    }
				case '1': 
				{
				    int counter = count(s, '1', j);
					result[i] = result[i] + String.valueOf(counter) + "1";
					j = j + counter;
					break;
				}
				case '2':
				{
				    int counter = count(s, '2', j);
					result[i] = result[i] + String.valueOf(counter) + "2";
					j = j + counter;
					break;
				}
				case '3':
				{//case "3"
				    int counter = count(s, '3', j);
					result[i] = result[i] + String.valueOf(counter) + "3";
					j = j + counter;
					break;
				}
				case '4':
				{
				    int counter = count(s, '4', j);
					result[i] = result[i] + String.valueOf(counter) + "4";
					j = j + counter;
					break;
				}
				case '5':
				{
				    int counter = count(s, '5', j);
					result[i] = result[i] + String.valueOf(counter) + "5";
					j = j + counter;
					break;
				}
				case '6':
				{
				    int counter = count(s, '6', j);
					result[i] = result[i] + String.valueOf(counter) + "6";
					j = j + counter;
					break;
				}
				case '7':
				{
				    int counter = count(s, '7', j);
					result[i] = result[i] + String.valueOf(counter) + "7";
					j = j + counter;
					break;
				}
				case '8':
				{
				    int counter = count(s, '8', j);
					result[i] = result[i] + String.valueOf(counter) + "8";
					j = j + counter;
					break;
				}
				case '9':
				{
				    int counter = count(s, '9', j);
					result[i] = result[i] + String.valueOf(counter) + "9";
					j = j + counter;
					break;
				}
				default:
				    break;
					
				}
			}
		}
		return result[n];
	}
	 public static int count(String s, char digit, int j)
   {
       int counter = 1;
       while (counter + j < s.length() && s.charAt(counter + j) == digit)
           counter++;
       return counter;
   }
	 
	public static void main(String[] args)
	{
		System.out.println(String.valueOf(5));
	}
}
