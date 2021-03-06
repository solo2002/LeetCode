/*
 * Given a string array words, find the maximum value of length(word[i]) * length(word[j]) where the two words
 *  do not share common letters. You may assume that each word will contain only lower case letters. If no such 
 *  two words exist, return 0.

Example 1:
Given ["abcw", "baz", "foo", "bar", "xtfn", "abcdef"]
Return 16
The two words can be "abcw", "xtfn".

Example 2:
Given ["a", "ab", "abc", "d", "cd", "bcd", "abcd"]
Return 4
The two words can be "ab", "cd".

Example 3:
Given ["a", "aa", "aaa", "aaaa"]
Return 0
No such pair of words.
 */
public class MaxProductOfWordLen {
	public int maxProduct(String[] words) 
	{
		if(words == null || words.length == 1)
			return 0;
		int len = words.length;
		int[] mask = new int[len];
		int result = 0;
		for(int i = 0; i < len; i++)
		{
			int num = 0;
			for(int j = 0; j < words[i].length(); j++)
			{
				char c = words[i].charAt(j);
				num = num | (1 << (c - 'a'));
			}
			mask[i] = num;
		}
		
		for(int i = 0; i < len; i++)
		{
			for(int j = 1; j < len; j++)
			{
				if((mask[i] & mask[j]) == 0) //two words are totally different
					result = Math.max(result, words[i].length() * words[j].length());
			}
		}
		return result;
	}

}
