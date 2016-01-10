/*
 * You are a product manager and currently leading a team to develop a new product. Unfortunately, the 
 * latest version of your product fails the quality check. Since each version is developed based on the 
 * previous version, all the versions after a bad version are also bad.

Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all 
the following ones to be bad.

You are given an API bool isBadVersion(version) which will return whether version is bad. Implement a 
function to find the first bad version. You should minimize the number of calls to the API.
 */
public class FirstBadVersion {
	public boolean isBadVersion(int n)
	{//dummy code
		return true;
	}
	public int firstBadVersion(int n)
	{//binary search
		int low = 1;
		int hi = n;
		int last = 0;
		while (low <= hi)
		{
			int mid = low + (hi - low) / 2; //to avoid over flow when using (low + hi) /2
			if (isBadVersion(mid))
			{
				hi = mid - 1;
				last = mid;
			}
			else
				low = mid + 1;
		}
		return last;
	}
}
