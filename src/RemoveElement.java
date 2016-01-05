/*
 * Given an array and a value, remove all instances of that value in place and 
 * return the new length.

The order of elements can be changed. It doesn't matter what you leave beyond the new length. 
 */
public class RemoveElement {
	public static int removeElement(int[] nums, int val) {
        int j = 0;
        int counter = nums.length;
        for(int i = 0; i < nums.length; i++)
        {
            if (nums[i] != val)
                nums[j++] = nums[i];
            else
                --counter;
        }
        return counter;
    }
	public static void main(String[] args)
	{
		int[] nums = {1, 2, 3, 4, 5};
		System.out.println(removeElement(nums, 4));
		for(int i : nums)
			System.out.print(i+"\t");
	}

}
