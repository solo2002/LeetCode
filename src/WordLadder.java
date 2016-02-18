/*Given two words (beginWord and endWord), and a dictionary's word list, find the length of shortest 
 * transformation sequence from beginWord to endWord, such that:

Only one letter can be changed at a time
Each intermediate word must exist in the word list
For example,

Given:
beginWord = "hit"
endWord = "cog"
wordList = ["hot","dot","dog","lot","log"]
As one shortest transformation is "hit" -> "hot" -> "dot" -> "dog" -> "cog",
return its length 5.

Note:
Return 0 if there is no such transformation sequence.
All words have the same length.
All words contain only lowercase alphabetic characters.
*/
import java.util.Set;
import java.util.Queue;
import java.util.LinkedList;
import java.util.HashSet;
public class WordLadder {
	public int ladderLength(String beginWord, String endWord, Set<String> wordList) {
    int result = 1;
    Queue<String> q = new LinkedList<String>();
    HashSet<String> visited = new HashSet<String>();//visited words
    q.offer(beginWord);//add the first word into queue
    visited.add(beginWord);
    while(!q.isEmpty())
    {
    	int count = q.size();
    	for(int i = 0; i < count; i++)
    	{
    		char[] chs = q.poll().toCharArray();//traverse words in the queue
    		for(int j = 0; j < chs.length; j++)
    		{//traverse each word
    			for(char ch = 'a'; ch <= 'z'; ch++)
    			{//try every single char from a to z
    				char chOld = chs[j];
    				if(ch == chs[j])
    					continue;
    				chs[j] = ch;
    				String current = String.valueOf(chs);
    				if(current.equals(endWord))
    					return result + 1;
    				if(!visited.contains(current) && wordList.contains(current))
    				{
    					q.add(current);
    					visited.add(current);
    				}
    				chs[j] = chOld; //restore chs[j]
    			}
    			
    		}
    	}
    	result++;//next level of BFS
    }
    
    return 0;
  }
}
