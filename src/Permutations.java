/*Given a collection of distinct numbers, return all possible permutations.

For example,
[1,2,3] have the following permutations:
[1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], and [3,2,1].
 * 
 * 
 * Backtracking
 */
import java.util.List;
import java.util.ArrayList;
public class Permutations {
	List<List<Integer>> result;
	public List<List<Integer>> permute(int[] nums)
	{
		result = new ArrayList<List<Integer>>();
    if (nums == null || nums.length == 0)
        return result;
    List<Integer> perm = new ArrayList<Integer>();
    boolean[] used = new boolean[nums.length];
    backtrack(perm, 0, used, nums);
    return result;
	}
	void backtrack(List<Integer> perm, int position, boolean[] used, int[] nums)
	{
		if (position == nums.length)
		{
			//System.out.println("add new:" + perm.toString());
			result.add(new ArrayList<>(perm));
			//System.out.println("result:" + result.toString());
			return;
		}
		for(int j = 0; j < nums.length; j++)
		{
			if(used[j]) continue;
			perm.add(nums[j]);
			used[j] = true;
			backtrack(perm, position + 1, used, nums);
			perm.remove(perm.size() - 1);
			used[j] = false;
		}
	}
	/*public List<List<Integer>> permute(int[] nums) {
    result = new ArrayList<>();
    if (nums == null || nums.length == 0)
        return result;
    ArrayList<Integer> perm = new ArrayList<Integer>();
    backtrack(perm, 0, nums);
    return result;
	}
	
	private void backtrack(ArrayList<Integer> perm, int i, int[] nums)
	{
		if (i == nums.length)
		{
			result.add(perm);
			return;
		}
		for(int j = 0; j <= i; j++)
		{
			perm.add(j, nums[i]);
			backtrack(perm, i + 1, nums);
			perm.remove(j);
		}
	}*/
	public static void main(String[] args)
	{
		Permutations p = new Permutations();
		int[] nums = {1, 2, 3};
		List<List<Integer>> l = p.permute(nums);
		for(List<Integer> c : l)
			System.out.println(c.toString());
	}
}
