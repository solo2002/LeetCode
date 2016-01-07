/*
 * Given numRows, generate the first numRows of Pascal's triangle.

For example, given numRows = 5,
Return

[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
 */
import java.util.List;
import java.util.ArrayList;
public class PascalTriangle {
	public static List<List<Integer>> generate(int numRows) 
	{
		List<List<Integer>> result = new ArrayList<>();
		 if (numRows <= 0)
       return result;
   List<Integer> l = new ArrayList<Integer>();
   l.add(1);
   result.add(l);//the numRows == 1
   
   for (int i = 2; i <= numRows; i++)
   {//each cycle take care of one row
       List<Integer> l2 = new ArrayList<Integer>();//for the record of last row
       List<Integer> l3 = new ArrayList<Integer>();//for the current row
       l3.add(1); //for the first element in current row
       l2 = result.get(i - 2);//the difference bewteen current row and last element list in result is 2
       for (int j = 1; j < l2.size(); j++)
       {
           l3.add(l2.get(j-1) + l2.get(j));
       }
       l3.add(1);//the last element in current row
       result.add(l3);
   }
   return result;
  }
	public static List<List<Integer>> generate2(int numRows)
	{// a clearer solution
		List<List<Integer>> result = new ArrayList<>();
		 if (numRows <= 0)
      return result;
	  List<Integer> pre = new ArrayList<Integer>();
	  pre.add(1);
		result.add(pre);
		for (int i = 2; i <= numRows; i++)
		{
			List<Integer> cur = new ArrayList<Integer>();
			cur.add(1);//first
			for (int j = 0; j < pre.size()-1; j++)
			{
				cur.add(pre.get(j) + pre.get(j+1));
			}
			cur.add(1);//last
			result.add(cur);
			pre = cur;
		}
	  
	  return result;
	}
	public static void main(String[] args)
	{
		List<List<Integer>> result = generate2(3);
		for (List<Integer> l : result)
			System.out.println(l);
	}
}
