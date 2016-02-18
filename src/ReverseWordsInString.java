/*
 * Given an input string, reverse the string word by word.

For example,
Given s = "the sky is blue",
return "blue is sky the".
 */
public class ReverseWordsInString {
	 public static String reverseWords(String s) 
	 {
		 if(s == null || s.length() == 0)
			 return "";
		 String newstr = s.trim();
		 StringBuilder sb = new StringBuilder();
		 int end = newstr.length();
	
		 for(int i = newstr.length() - 1; i >= 0; i--)
		 {
			 if(newstr.charAt(i) == ' ')
			 {
				 //space = true;
				 sb.append(newstr.substring(i + 1, end)).append(" ");
				 end = i;
			 }
		 }
		 sb.append(newstr.substring(0,end));//for single string and the first string in original String.
		
		 return sb.toString();
	 }
	 public static void main(String[] args)
	 {
		 String s1 = " 1";
		
		 System.out.print(reverseWords(s1));
	 }
}
