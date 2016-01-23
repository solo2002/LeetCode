/*
 * remove vowels from a String
 */
public class RemoveVowelsFromStr {
public static String removeVowels(String str)
{
	if (str == null || str.length() == 0)
		return "";
	//char c =str.charAt(0);
	if (str.charAt(0) == 'a' || str.charAt(0)== 'e' || str.charAt(0) == 'i' || str.charAt(0) =='o' || str.charAt(0) == 'u')
		return removeVowels(str.substring(1));
	else
		return str.charAt(0)+ removeVowels(str.substring(1));
}
public static void main(String[] args)
{
	System.out.println(removeVowels("rescue"));
}
}
