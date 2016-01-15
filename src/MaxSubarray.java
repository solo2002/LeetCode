/*
 * Find the contiguous subarray within an array (containing at least one number) which has the largest sum.
return the max sum
For example, given the array [−2,1,−3,4,−1,2,1,−5,4],
the contiguous subarray [4,−1,2,1] has the largest sum = 6.
 */
public class MaxSubarray {
	public int maxSubArray(int[] nums)
	{
		if(nums == null || nums.length == 0)
			return 0;
		int len = nums.length;
		int curMax = nums[0];
		int finalMax = nums[0];
		for(int i = 1; i < len; i++)
		{
			curMax = Math.max(nums[i], curMax + nums[i]);
			finalMax = Math.max(curMax, finalMax);
		}
		return finalMax;
	}
}
