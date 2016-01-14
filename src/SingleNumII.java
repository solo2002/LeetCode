/*
 * Given an array of integers, every element appears three times except for one. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 */
import java.util.Arrays;
public class SingleNumII {
	 public static int singleNumber(int[] nums) {
     //sort the array
		 if (nums == null) return -1;
	    if (nums.length == 1) return nums[0];
     Arrays.sort(nums);
     if (nums[0] != nums[1])
    	 return nums[0];
     else
     {
	     for(int i = 3; i < nums.length - 1; )
	     {
	    	 if (nums[i] == nums[i + 1])
	    	 {
	    		 i = i+3;
	    		 continue;
	    	 }
	    	 else
		    	 return nums[i];
	     }
     }
     return nums[nums.length - 1];
 }
//bit manipulation
	 public static int singleNumber2(int[] nums)
	 {
		 int[] digit = new int[32];
		 for(int i = 0; i < nums.length; i++)
		 {
			 int mask = 1;
			 for( int j = 31; j >= 0; j--)
			 {
				 if((mask & nums[i]) != 0)
					 digit[j] ++;
				 mask <<= 1;
			 }
		 }
		 int result = 0;
		 for(int i = 0; i < 32; i++)
		 {
			 if (digit[i] % 3 == 1)
				 result++;
			 if (i == 31)//only left shift 31 times
				 break;
			 result <<= 1;
		 }
		 return result;
	 }
	 public static void main(String[] args)
	 {
		 int[] nums = {1};
		 //System.out.println(singleNumber(nums));
		 System.out.println(singleNumber2(nums));
	 }
}
