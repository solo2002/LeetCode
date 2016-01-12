/*
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

For example,
Given nums = [0, 1, 3] return 2.

Note:
Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?
 */
public class MissingNum {
	public int missingNumber(int[] nums)
	{
		if (nums == null || nums.length == 0)
			return -1;
		int n = nums.length;
		int sum = n * (n + 1) / 2;
		for (int i = 0; i < n; i++)
		{
			sum = sum - nums[i];
		}
		return sum;
	}
}
