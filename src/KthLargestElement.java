/*
 * Find the kth largest element in an unsorted array. Note that it is the kth largest element in the sorted order, 
 * not the kth distinct element.

For example,
Given [3,2,1,5,6,4] and k = 2, return 5.

Note: 
You may assume k is always valid, 1 ≤ k ≤ array's length.
 */
import java.util.Comparator;
import java.util.PriorityQueue;
public class KthLargestElement {
	public int findKthLargest(int[] nums, int k)
	{
		if(nums == null || nums.length < k)
		{
			return Integer.MAX_VALUE;
		}
		int len = nums.length;
		PriorityQueue<Integer> pq = new PriorityQueue<>(len, new Comparator<Integer>()
				{
					public int compare(Integer n1, Integer n2)
					{
						return n2 - n1;//overload comparator
					}
				});
	
		for(int num: nums){
			pq.offer(num);
		}
		int[] res = new int[k];
		for(int i=0; i<k; i++){
			res[i] = pq.poll();
		}
		return res[k-1];
	}
}
