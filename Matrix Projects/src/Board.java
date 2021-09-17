
public class Board
	{

		static String [] [] board = new String [3] [3];
	
		public static void main(String[] args)
		{
			prepareBoard();
			//board [2] [1] = "X";
			displayBoard();
		}
	
	public static void prepareBoard()
		{
				for(int row = 0; row < 3; row++) 
					{
					for(int col = 0; col < 3; col++)
						{
							System.out.println(board[row][col] = " ");
						}
			}
		}
		public static void displayBoard()
		{
			System.out.println("     1   2   3  ");
			System.out.println("   -------------");
			System.out.println("A | " + board[0][0] + " | " + board[0][1] + " | " + board[0][2] + " | ");
			System.out.println("   -------------");
			System.out.println("B | " + board[1][0] + " | " + board[1][1] + " | " + board[1][2] + " | ");
			System.out.println("   -------------");
			System.out.println("C | " + board[2][0] + " | " + board[2][1] + " | " + board[2][2] + " | ");
			System.out.println("   -------------");

			}
			
	}
	
