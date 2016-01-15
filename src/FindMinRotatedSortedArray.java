/*
 * Suppose a sorted array is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

Find the minimum element.

You may assume no duplicate exists in the array.
 */
public class FindMinRotatedSortedArray {
	public int findMin(int[] nums)
	{
		if (nums == null || nums.length == 0)
			return Integer.MIN_VALUE;
		int lo = 0;
		int hi = nums.length - 1;
		int mid = 0;
		while (lo < hi)
		{
			mid = lo + (hi - lo)/2;
			if(nums[mid] > nums[hi])
				lo = mid + 1; //search [mid+1, hi]
			else
				hi = mid; //search [lo, mid]
		}
		return nums[hi];
	}
}
