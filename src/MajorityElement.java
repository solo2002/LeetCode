import java.util.Arrays;

/*
 * Given an array of size n, find the majority element. The majority element is the element that 
 * appears more than floor(n/2) times.

You may assume that the array is non-empty and the majority element always exist in the array.
 */
public class MajorityElement {
	public static int majorityElement(int[] nums)
	{
		/*if (nums.length == 1)
			return nums[0];
		Arrays.sort(nums);
		int max = 1;
		int current = nums[0];
		int majority = nums.length/2;
		for(int i = 1; i < nums.length; i++)
		{
			if (nums[i] == current)
			{
				max++;
				if (max > majority)
					return current;
			}
			else
			{//reset
				current = nums[i];
				max = 0;
			}
		}
		throw new IllegalArgumentException("No majority elements exists");*/
		int counter = 0;
		int target = 0;
		for(int n : nums)
		{
			if(counter == 0)
			{
				target = n;
				counter++;
			}
			else if(n == target)
				counter++;
			else
				counter--;
		}
		return target;
	}
	
	public static void main(String[] args)
	{
		int[] nums = {0};
		System.out.println(majorityElement(nums));
	}

}
