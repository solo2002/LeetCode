/*
 * A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).

The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right 
corner of the grid (marked 'Finish' in the diagram below).

How many possible unique paths are there?
 */
//Dynamic programming
public class UniquePaths {
	 public int uniquePaths(int m, int n) 
	 {
    if (m == 0 || n == 0) return 0;
    int[][] list = new int[m][n];
    for(int i = 0; i < n; i++)
    	list[0][i] = 1;//only one path
    for(int i = 0; i < m; i++)
    	list[i][0] = 1;//only one path
    for(int i = 1; i < n; i++)
    {
    	for(int j = 1; j < m; j++)
    	{
    		list[i][j] = list[i-1][j] + list[i][j-1];
    	}
    }
    return list[m-1][n-1];
   }
	 
}
