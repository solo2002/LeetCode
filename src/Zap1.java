import java.util.HashSet;
public class Zap1 {
	public static int numOfPalindrome2(String s)
	{
		if(s == null || s.length() == 0)
			return 0;
		int len = s.length();
		HashSet<String> set = new HashSet<>();
		for(int i = 0; i < len; i++)
		{
			String str2 = s.charAt(i) + "";
			set.add(str2);
		}
		for(int i = 0; i < len; i++)
		{
			int j = i-1;
			int k = i+1;
			while(j >= 0 && k < len)
			{
				if(s.charAt(j) == s.charAt(k))
				{
					String s1 = s.substring(j, k+1)+"";
					System.out.print(s1 + "	");
					set.add(s1);
					j--;
					k++;
				}
				else
					break;
			}
			int l = i - 1;
			int m = i + 1;
			if(m < len && s.charAt(i) == s.charAt(m))
			{
				String s2 = s.substring(i, m+1) + "";
        set.add(s2);
        System.out.print(s2 + "	");
				m++;
				while(l >= 0 && m < len)
				{
					if(s.charAt(l) == s.charAt(m))
					{
						String s3 = s.substring(l, m+1)+"";
						System.out.print(s3 + "	");
						set.add(s3);
						l--;
						m++;
					}
					else
						break;
				}
			}
		}
		//if(isP(s))
			//set.add(s);
		//for(String s1 : set)
			//System.out.print(s1+"\t");
		return set.size();
	}
	public static int numOfPalindrome(String s)
	{
		int result = 0;
		if(s == null || s.length() == 0)
			return result;
		HashSet<String> set = new HashSet<>();
		int len = s.length();
		for(int i = 0; i < len; i++)
		{
			for(int j = i+1; j < len - 1; j++)
			{
				String str = s.substring(i, j + 1);
				if(isP(str))
					set.add(str);
			}
		}
		for(int i = 0; i < len; i++)
		{
			String str2 = s.charAt(i) + "";
			set.add(str2);
		}
		if(isP(s)) set.add(s);
		result = set.size();
		for(String s1 : set)
			System.out.print(s1+"\t");
		return result;
	}
	public static boolean isP(String s)
	{
		if(s == null) return false;
		if(s.length() == 0) return true;
		for(int i = 0; i < s.length()/2; i++)
		{
			if( s.charAt(i) != s.charAt(s.length() - i - 1))
				return false;
		}
		return true;
	}
	public int GCD(int a, int b) {
	   if (b==0) return a;
	   return GCD(b,a%b);
	}
	public static void main(String[] args)
	{
		System.out.println(numOfPalindrome("aaaa"));
		System.out.println(numOfPalindrome2("aaaa"));
		
	}
}
