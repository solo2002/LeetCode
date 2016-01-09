/*
 * Implement strStr().

Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part 
of haystack.
 */
public class ImplementStrStr {
	public int strStr(String haystack, String needle)
	{
		if (haystack.length() < needle.length() || haystack == null || needle == null)
			return -1;
		if (needle.length() == 0)
			return 0;
		int hayLen = haystack.length();
		int neLen = needle.length();
		for (int i = 0; i <= hayLen - neLen; i++)// note: <=
		{
			String sub = haystack.substring(i, i + neLen);
			if (sub.equals(needle))
				return i;
		}
		return -1;
	}
}
