/*
 * Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets 
 * in the array which gives the sum of zero.

Note:
Elements in a triplet (a,b,c) must be in non-descending order. (ie, a ≤ b ≤ c)
The solution set must not contain duplicate triplets.
    For example, given array S = {-1 0 1 2 -1 -4},

    A solution set is:
    (-1, 0, 1)
    (-1, -1, 2)
 */
import java.util.List;
import java.util.ArrayList;
public class ThreeSum {
	public static List<List<Integer>> threeSum(int[] nums) {
    if(nums == null || nums.length == 0)
        return null;
    List<List<Integer>> result = new ArrayList<List<Integer>> ();
    int len = nums.length;
    for(int i = 0; i < len - 2; i++)
    {
        for(int j = i + 1; j < len - 1; j++)
        {
            for(int k = j + 1; k < len; k++)
            {
                if(nums[i] + nums[j] + nums[k] == 0)
                {
                    ArrayList<Integer> list = new ArrayList<Integer>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    result.add(list);
                }
            }
        }
    }
    return result;
}
	public static void main(String[] args)
	{
		int[] nums = {-1, 0, 1, 2, -1, -4};
		List<List<Integer>> result = threeSum(nums);
		for(List<Integer> l : result)
			System.out.println(l);
	}
}
