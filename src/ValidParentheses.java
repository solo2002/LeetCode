/*
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input 
 * string is valid.

The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 */
import java.util.Stack;
public class ValidParentheses {
	public boolean isValid(String s)
	{
		if (s == null || s.length() == 0 || s.length() % 2 != 0)
			return false;
		Stack<Character> st = new Stack<Character>();
		for (int i = 0; i < s.length(); i++)
		{
			char a = s.charAt(i);
			if (a == '(' || a == '[' || a == '{')
				st.push(a);
			else
			{//), ], }
				if (!st.isEmpty()) 
				{
					if (st.pop() == '(' && a == ')')
						continue;
					if (st.pop() == '[' && a == ']')
						continue;
					if (st.pop() == '{' && a == '}')
						continue;
					return false;
				}
				return false;
			}
		}
		return st.isEmpty();
	}
}
