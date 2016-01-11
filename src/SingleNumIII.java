import java.lang.reflect.Array;
import java.util.Arrays;

/*Given an array of numbers nums, in which exactly two elements appear only once and all the other 
 * elements appear exactly twice. Find the two elements that appear only once.

For example:

Given nums = [1, 2, 1, 3, 2, 5], return [3, 5].

Note:
The order of the result is not important. So in the above example, [5, 3] is also correct.
Your algorithm should run in linear runtime complexity. Could you implement it using only constant space 
complexity?
 */
import java.util.HashSet;
public class SingleNumIII {
	public static int[] singleNumber(int[] nums)
	{//O(nlogn)
		int[] result = new int[2];
		if (nums == null || nums.length < 2)//at least has 2 elements
			return result;
		Arrays.sort(nums);
		int len = 0;
		for (int i = 0; i < nums.length; )
		{
			if (i + 1 < nums.length && nums[i] != nums[i + 1])
			{
				result[len++] = nums[i];
				if (i + 1 == nums.length - 1) 
					{
						result[len] = nums[i+1];
						return result;
					}
				i++;
			}
			else i = i + 2;
		}
		if (nums[nums.length - 1] != nums[nums.length - 2])
		    result[len] = nums[nums.length - 1];//the last one is single
		return result;
	}
	public static int[] singleNumber2(int[] nums)
	{//O(n)
		int[] result = new int[2];
		if (nums == null || nums.length < 2)//at least has 2 elements
			return result;
		
		HashSet<Integer> set = new HashSet<>();
		for(int i : nums)
		{
			if (set.contains(i)) 
				set.remove(i);
			else
				set.add(i);
		}
		//convert a HashSet to array
		int i = 0;
		for(Integer j : set)
		{
			result[i] = j;
		}
		return result;
	}
	public static void main(String[] args)
	{
		int[] nums = {1, 2, 1, 3, 2, 5};
		int[] r = singleNumber(nums);
		for(int i : r)
			System.out.println(i);
	}
}
