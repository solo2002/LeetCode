/*
 * Given a sorted integer array without duplicates, return the summary of its ranges.

For example, given [0,1,2,4,5,7], return ["0->2","4->5","7"].
 */
import java.util.List;
import java.util.ArrayList;
public class SummayRanges {
	public List<String> summaryRanges(int[] nums)
	{
		List<String> result = new ArrayList<String>();
		if (nums == null || nums.length == 0)
			return result;
		int start = 0;
		int end = 0;
		for (int i = 1; i < nums.length; i++)
		{
			if (nums[i] - nums[i-1] == 1)
			{
				end = i;
			}
			else
			{
				if (start == end)
					result.add(nums[end]+"");
				else
					result.add(nums[start] + "->" + nums[end]);
				end = i;
				start = end;
			}
			
		}
		if (start == end)
			result.add(nums[end]+"");
		else
			result.add(nums[start] + "->" + nums[end]);
		return result;
	}
}
