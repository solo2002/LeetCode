
public class LongestCommonPrefix {
	public String longestCommonPrefix(String[] strs)
	{
		if (strs == null) 
			return null;
		if (strs.length == 0)
			return "";
		StringBuilder sb = new StringBuilder();
		int len = strs[0].length();
		int length = strs.length;
		for (int i = 0; i < len; i++)
		{
			char a = strs[0].charAt(i);
			for (int j = 1; j < length; j++)
			{
				if (i > strs[j].length() - 1)
					return sb.toString();//shorter string
				if (a != strs[j].charAt(i))
					return sb.toString();
			}
			sb.append(a);
		}
		return sb.toString();
	}
	public static void main(String[] args)
	{
		StringBuilder sb = new StringBuilder();
		sb.append("7");
		sb.append('1');
		System.out.print(sb);
	}
}
