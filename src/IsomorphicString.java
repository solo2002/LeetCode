/*
 * Given two strings s and t, determine if they are isomorphic.

Two strings are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the 
order of characters. No two characters may map to the same character but a character may map 
to itself.

For example,
Given "egg", "add", return true.

Given "foo", "bar", return false.

Given "paper", "title", return true.
 */
import java.util.HashMap;
public class IsomorphicString {
	public boolean isIsomorphic(String s, String t)
	{
		if (s == null || t == null)
			return false;
		if (s.length() != t.length())
			return false;
		HashMap<Character, Character> st = new HashMap<Character, Character>();//map s to t
		HashMap<Character, Character> ts = new HashMap<Character, Character>();//map t to s
		int len = 0;
		int length = s.length();
		while (len < length)
		{
			if (st.containsKey(s.charAt(len)))
			{
				if (st.get(s.charAt(len)) != t.charAt(len))
					return false;
			}
			else if (ts.containsKey(t.charAt(len)))
			{//for "ab" "aa" case, specific one to specific one
				if (ts.get(t.charAt(len)) != s.charAt(len))
					return false;
			}
			else
			{
				st.put(s.charAt(len), t.charAt(len));
				ts.put(t.charAt(len), s.charAt(len));
			}
			len++;
		}
		return true;
		
	}

}
