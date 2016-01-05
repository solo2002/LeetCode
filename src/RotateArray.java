/*
 * Rotate an array of n elements to the right by k steps.

For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4]. 
 */
public class RotateArray {
	public static void rotate(int[] nums, int k) 
	{//O(n), extra space O(n)
		int[] temps = null;
		temps = nums.clone();
        for (int i = 0; i < nums.length; i++)
        {
        	nums[(i+k)%nums.length] = temps[i]; 
        }
        
    }
	public static void main(String[] args)
	{
		int[] nums = {1, 2, 3, 4, 5};
		
		rotate(nums, 2);
		 for (int i : nums)
			 System.out.println(i);
	}

}
