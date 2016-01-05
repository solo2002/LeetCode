/*
 * Given a non-negative number represented as an array of digits, plus one to the number.

The digits are stored such that the most significant digit is at the head of the list.
29 + 1 => 30
9 + 1 => 10
 */
public class PlusOne {
	public static int[] plusOne(int[] nums)
	{
		if (nums.length == 0)
			return nums;
		for (int i = nums.length - 1; i >= 0; i--)
		{
			if (nums[i] < 9)
			{
				nums[i]++;
				return nums;
			}
			else
			{
				nums[i] = 0;
				if (i == 0)//the most significant digit
				{
					int[] newNums = new int[nums.length + 1];
					newNums[0] = 1;//add new digit
					for (int j = 0; j < nums.length; j++)
						newNums[j + 1] = nums[j];
					return newNums;
				}
			}
		}
		return nums;
	}
	public static void main(String[] args)
	{
		int[] nums = {9};
		int[] nums1 = {2, 3};
		int[] nums2 = {9,9};
		for (int i : plusOne(nums2))
			System.out.println(i);
	}
}
