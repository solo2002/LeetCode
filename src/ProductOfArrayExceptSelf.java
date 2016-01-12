/*
 * Given an array of n integers where n > 1, nums, return an array output such that output[i] is equal to the product of 
 * all the elements of nums except nums[i].

Solve it without division and in O(n).

For example, given [1,2,3,4], return [24,12,8,6].

Follow up:
Could you solve it with constant space complexity? (Note: The output array does not count as extra space for the purpose 
of space complexity analysis.)
 */
public class ProductOfArrayExceptSelf {
	public int[] productExceptSelf(int[] nums)
	{
		int[] result = null;
		if (nums == null || nums.length <= 1)
			return result;
		int len = nums.length;
		result = new int[len];
		int lm = 1;
		int rm = 1;
		result[0] = 1;//the first element equals to the product of all the other elements' product on the right 
		for(int i = 1; i < len; i++)
		{//calculate product from its left side
			result[i] = lm * nums[i - 1];
			lm = result[i];
		}
		for(int i = len - 2; i >= 0; i--)
		{//now calculate product from its right side
			rm = rm * nums[i + 1];
			result[i] = rm * result[i + 1];
		}
		return result;
	}

}
