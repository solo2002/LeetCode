import java.util.Arrays;
import java.util.HashMap;

/*
 * Given an array of integers, find if the array contains any duplicates. Your function should 
 * return true if any value appears at least twice in the array, and it should return false if 
 * every element is distinct. 
 */
public class ContainDuplicate {
	public static boolean containsDuplicate(int[] nums)
	{
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < nums.length; i++)
		{
			if (map.containsKey(nums[i]))
				return true;
			map.put(nums[i], i);
		}
		return false;
	}
	public static boolean containsDuplicate2(int[] nums)
	{
		Arrays.sort(nums);
		for (int i = 0; i < nums.length-1; i++)
		{
			if (nums[i] == nums[i+1])
				return true;
		}
		return false;
	}
	public static void main(String[] args)
	{
		int[] nums = {0,2, 3, 4, 5, 7, 1};
		System.out.println(containsDuplicate2(nums));
	}
}
