import java.util.HashMap;

/*
 * Given an array of integers, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.

You may assume that each input would have exactly one solution.

Input: numbers={2, 7, 11, 15}, target=9
Output: index1=1, index2=2 
 */
public class TwoSum {

	public static int[] twoSum(int[] numbers, int target)
	{
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(); 
		for(int i = 0; i < numbers.length; i++)
		{
			int a = numbers[i];
			if (map.containsKey(target - a))
				return new int[] {map.get(target - a) + 1, i + 1};
			else
				map.put(a, i);
		}
		throw new IllegalArgumentException("No two sum solution");
	}
	public static void twoSum2(int[] A, int d)
	{
		if (A == null || A.length == 0)
			System.out.println("The array is empty");
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < A.length; i++)
		{
			if(map.containsKey(d - A[i]))
			{//Supposed that there is not duplicate number in the array, since the key of HashMap should be specific.
				System.out.println("(" + A[map.get(d - A[i])] + ", " + A[i] + ")");
				//map.put(A[i], i); 
			}
			else
				map.put(A[i], i);
		}
		
	}
	public static void bruteForce(int[] A, int d)
	{
		if (A == null || A.length == 0)
			System.out.println("The array is empty");
		for(int i = 0; i < A.length - 1; i++)
		{
			for(int j = i + 1; j < A.length; j++)
			{//I made a mistake there this morning where I initialize j as 1, and that's why duplicated pairs of numbers were printed 
				if (A[i] + A[j] == d)
					System.out.println("(" + A[i] + ", " + A[j] + ")");
			}
		}
	}
	public static void main(String[] args)
	{
		int[] A = {5, 0, -4, 9, 8, 3, 2, -3};
		int d = 5;
		bruteForce(A, d);
		System.out.println("==========");
		twoSum2(A, d);
	}
}
