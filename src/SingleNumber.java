
/*
 * Given an array of integers, every element appears twice except for one. Find that single one.
 */
public class SingleNumber {
	public static int singleNumber1(int[] nums)
	{//use xor, same to 0, different to 1
		int num = 0;
		for (int i : nums)
		{
			num ^= i;
		}
		return num;
	}
	
	public static void main(String[] args)
	{
		int[] nums = {2, 3, 4, 2, 4, 5, 3};
		System.out.println(singleNumber1(nums));
	}

}
