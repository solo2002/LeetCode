/*
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:
You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold 
additional elements from nums2. The number of elements initialized in nums1 and nums2 are m 
and n respectively.
 */
public class MergeSorttedArray {
	public void merge(int[] nums1, int m, int[] nums2, int n)
	{//compare reversely
		int a1 = m;
		int a2 = n;
		int newP = m + n - 1;
		while (a1 > 0 && a2 > 0)
		{
			if (nums1[a1 - 1] < nums2[a2 - 1])
			{
				nums1[newP--] = nums2[a2 - 1];
				a2--;
			}
			else
			{
				nums1[newP--] = nums1[a1 -1];
				a1--;
			}
		}
		if (a1 == 0)//no elements left in nums1, then just copy whatever left in nums2 to nums1
		{
			for (int i = 0; i < a2; i++)
				nums1[i] = nums2[i];
		}
	}

}
