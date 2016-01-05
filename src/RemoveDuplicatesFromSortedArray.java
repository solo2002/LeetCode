/*
 *  Given a sorted array, remove the duplicates in place such that each element appear only once
 *   and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

For example,
Given input array nums = [1,1,2],

Your function should return length = 2, with the first two elements of nums being 1 and 2 
respectively. It doesn't matter what you leave beyond the new length. 
 */
public class RemoveDuplicatesFromSortedArray {
 public static int removeDuplicates(int[] nums) {
        int slowP = 0; //the slow pointer
        int fastP = 1; //the fast pointer
        int count = 1; //count the number of different elements
        if (nums.length == 1)
            return count; //only one number
        while (fastP < nums.length)
        {
            if (nums[slowP] == nums[fastP])
            {
                fastP++;
                continue;
            }
            else
            {//two cases, neigthbor or not neightbor
                if (slowP + 1 == fastP)
                {//neighbor case
                    slowP++;
                    fastP++;
                    count++;
                }
                else
                {
                    int temp = nums[fastP];
                    nums[fastP] = nums[slowP];
                    nums[slowP + 1] = temp;
                    slowP++;
                    fastP++;
                    count++;
                }
            }
        }
        return count;
    }
 
 public static void main (String[] args)
 {
	 int[] nums = {1, 2, 2, 3};
	 System.out.println("total Num: "+removeDuplicates(nums));
	 for (int i : nums)
		 System.out.println(i);
 }
}
