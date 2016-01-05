/*
 * You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you 
climb to the top?
 */
public class ClimbingStairs {
	public static int climbStairs(int n)
	{//dynamic programming
		//base case: n = 0, return 0; n = 1, return 1; n = 2; return 2
		if (n <= 2)
			return n;
		int s1 = 1;
		int s2 = 2;
		int num = 0;
		for (int i = 3; i <= n; i++)
		{
			int temp = s1;
			num = temp + s2;
			s1 = s2;
			s2 = num;
		}
		return num;
		
	}

}
