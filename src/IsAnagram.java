import java.util.Arrays;

/*
 * Given two strings s and t, write a function to determine if t is an anagram of s.

For example,
s = "anagram", t = "nagaram", return true.
s = "rat", t = "car", return false.

Note:
You may assume the string contains only lowercase alphabets.
 */
public class IsAnagram {
	public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        //sort and then compare
        char[] schar = s.toCharArray();
        char[] tchar = t.toCharArray();
        Arrays.sort(schar);
        Arrays.sort(tchar);
        return Arrays.equals(schar, tchar);
    }
	public static boolean isAnagram2(String s, String t)
	{//count the number of different letters
		if (s.length() != t.length())
            return false;
		int[] count =  new int[26];
		for (int i = 0; i < s.length(); i++)
		{
			count[s.charAt(i) - 'a']++;
			count[t.charAt(i) - 'a']--;
		}
		for (int j = 0; j < count.length; j++)
			if (count[j] != 0) return false;
		return true;
	}

}
