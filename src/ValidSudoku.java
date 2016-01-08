/*
 * Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.

The Sudoku board could be partially filled, where empty cells are filled with the character '.'.


A partially filled sudoku which is valid.

Note:
A valid Sudoku board (partially filled) is not necessarily solvable. Only the filled cells 
need to be validated.
 */
import java.util.ArrayList;
public class ValidSudoku {
	 public static boolean isValidSudoku(char[][] board)
	 {
		 if (board == null) return false;
		 if (board.length != 9 || board[0].length != 9) return false;
		 for (int i = 0; i < board.length; i++) //for each row
		 {
			 ArrayList<Character> list = new ArrayList<Character>();
			 for(int j = 0; j < board[0].length; j++)
			 {
				 if (board[i][j] == '.')
					 continue;
				 if (list.contains(board[i][j]) || (board[i][j] - '0' < 0) || (board[i][j] - '9'> 0))
					 return false;
				 list.add(board[i][j]);
			 }
		 }
		 for (int j = 0; j < board[0].length; j++) //for each col
		 {
			 ArrayList<Character> list = new ArrayList<Character>();
			 for (int i = 0; i < board.length; i++)
			 {
				 if (board[i][j] == '.')
					 continue;
				 if (list.contains(board[i][j]) || (board[i][j] - '0' < 0) || (board[i][j] - '9' > 0))
					 return false;
				 list.add(board[i][j]);
			 }
		 }
		 //for each square
		 for (int n = 0; n < 9; n++)
		 {
			 ArrayList<Character> list = new ArrayList<Character>();
			 for (int i = n / 3 * 3; i < n / 3 * 3 + 3; i++)
			 {
				 for (int j = n % 3 * 3; j < n % 3 * 3 + 3; j++)
				 {
					 if (board[i][j] == '.')
						 continue;
					 if (list.contains(board[i][j]) || (board[i][j] - '0' < 0) || (board[i][j] - '9' > 0))
						 return false;
					 list.add(board[i][j]);
				 }
			 }
		 }
		 
		 return true;
	 }
	 public static void main(String[] args)
	 {
		 ArrayList<Character> list = new ArrayList<Character>();
		 char a = '1';
		 list.add(a);
		 char b = '1';
		 //System.out.println(list.contains(b) );
		
		 char[][] board = {{'.','.','4','.','.','.','6','3','.'},
				 							 {'.','.','.','.','.','.','.','.','.'},
				 							 {'4','.','.','.','.','.','.','9','.'},
				 							 {'.','.','.','5','6','.','.','.','.'},
				 							 {'4','.','3','.','.','.','.','.','1'},
				 							 {'.','.','.','7','.','.','.','.','.'},
				 						 	 {'.','.','.','5','.','.','.','.','.'},
				 							 {'.','.','.','.','.','.','.','.','.'},
				 							 {'.','.','.','.','.','.','.','.','.'}};
		 System.out.println(isValidSudoku(board));
		 
		 
	 }
}
