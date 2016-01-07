/*
 * Given an index k, return the kth row of the Pascal's triangle.

For example, given k = 3,
Return [1,3,3,1].
 */
import java.util.List;
import java.util.ArrayList;
public class PascalTriangle2 {
	public static List<Integer> getRow(int rowIndex) 
	{
    List<Integer> result = new ArrayList<Integer>();
    if (rowIndex < 0)
    	return result;
    result.add(1);
    if (rowIndex == 0)
    	return result;
    for (int i = 1; i <= rowIndex; i++)
    {
    	for (int j = result.size() - 2; j >= 0; j--)
    	{
    		result.set(j+1, result.get(j) + result.get(j+1));
    	}
    	result.add(1);
    }
    
    return result;
  }
	public static void main(String[] args)
	{
		List<Integer> result = getRow(7);
		for (int l : result)
			System.out.println(l);
	}
}
