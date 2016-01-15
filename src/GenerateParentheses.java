/*
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

For example, given n = 3, a solution set is:

"((()))", "(()())", "(())()", "()(())", "()()()"
 */
import java.util.List;
import java.util.ArrayList;
public class GenerateParentheses {
	public static List<String> generateParenthesis(int n)
	{
		List<String> result = new ArrayList<>();
		generate(result, "", n, n);
		return result;
	}
	private static void generate(List<String> result, String s, int l, int r)
	{
		if(l == 0 && r == 0) 
		{
			result.add(s);
			return;
		}
		if(l > 0) generate(result, s + "(", l - 1, r);
		if(r > l) generate(result, s + ")", l, r - 1);
	}
	public static void main(String[] args)
	{
		List<String> li = generateParenthesis(3);
		for(String s : li)
			System.out.print(s + "\t");
	}
}
