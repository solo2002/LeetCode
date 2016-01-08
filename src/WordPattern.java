/*
 * Given a pattern and a string str, find if str follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern 
and a non-empty word in str.

Examples:
pattern = "abba", str = "dog cat cat dog" should return true.
pattern = "abba", str = "dog cat cat fish" should return false.
pattern = "aaaa", str = "dog cat cat dog" should return false.
pattern = "abba", str = "dog dog dog dog" should return false.
Notes:
You may assume pattern contains only lowercase letters, and str contains lowercase letters 
separated by a single space.
 */
import java.util.HashMap;
public class WordPattern {
	public boolean wordPattern(String pattern, String str)
	{
		if (pattern == null || str == null)
			return false;
		char[] p = pattern.toCharArray();
		String[] s = str.split(" ");
		if (p.length != s.length)
			return false;
		
		HashMap<Character, String> map = new HashMap<Character, String>();
		for (int i = 0; i < s.length; i++)
		{
			if (map.containsKey(p[i]))
			{
				if (!map.get(p[i]).equals(s[i]))
					return false;
			}
			else
			{
				if (map.containsValue(s[i]))
					return false;
			}
			map.put(p[i], s[i]);
		}
		return true;
	}

}
