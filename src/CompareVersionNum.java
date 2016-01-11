/*
 * Compare two version numbers version1 and version2.
If version1 > version2 return 1, if version1 < version2 return -1, otherwise return 0.

You may assume that the version strings are non-empty and contain only digits and the . character.
The . character does not represent a decimal point and is used to separate number sequences.
For instance, 2.5 is not "two and a half" or "half way to version three", it is the fifth second-level 
revision of the second first-level revision.

Here is an example of version numbers ordering:

0.1 < 1.1 < 1.2 < 13.37
 */
import java.util.ArrayList;
public class CompareVersionNum {
	public int compareVersion(String version1, String version2) {
		 String[] v1 = version1.split("\\.");
     String[] v2 =version2.split("\\.");
     int len1 = v1.length;
     int len2 = v2.length;
     if (len1 == len2)
     {
         for(int i = 0; i < len1; i++)
         {
             if (compare(v1[i], v2[i]) == 1) return 1;
             if (compare(v1[i], v2[i]) == -1) return -1;
         }
         return 0;
     }
     else if (len1 < len2)
     {
         for(int i = 0; i < len1; i++)
         {
             if (compare(v1[i], v2[i]) == 1) return 1;
             if (compare(v1[i], v2[i]) == -1) return -1;
         }
         for(int i = len1; i < len2; i++)
         {
             if (Integer.valueOf(v2[i]) != 0) return -1;//for more decimals case
         }
         return 0;
     }
     else //len1 > len2
     {
         for(int i = 0; i < len2; i++)
         {
             if (compare(v1[i], v2[i]) == 1) return 1;
             if (compare(v1[i], v2[i]) == -1) return -1;
         }
         for (int i = len2; i < len1; i++)
         {
             if (Integer.valueOf(v1[i]) != 0) return 1;//for more decimals case
         }
         return 0;
     }
    
 }
 public int compare(String s1, String s2)
 {
     if (Integer.valueOf(s1) < Integer.valueOf(s2))
     	return -1;
     if (Integer.valueOf(s1) > Integer.valueOf(s2))
     	return 1;
     return 0;
 }
	
 public static void main(String[] args)
 {
	 String s1 = "1.23";
	 String[] s = s1.split("\\.");
	 for (String a : s)
		 System.out.println(a);
 }
}
