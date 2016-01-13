/*
 * Given an array of integers, every element appears three times except for one. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 */
import java.util.Arrays;
public class SingleNumII {
	 public int singleNumber(int[] nums) {
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

}
