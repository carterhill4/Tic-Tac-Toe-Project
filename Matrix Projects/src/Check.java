
public class Check
	{

		
				public static void isWonGame()
					{
					if ((Board.board[0][0].equals(Board.board[0][1]) && Board.board[0][1].equals(Board.board[0][2]) && !Board.board[0][1].equals(" ")) ||
						(Board.board[1][0].equals(Board.board[1][1]) && Board.board[1][1].equals(Board.board[1][2]) && !Board.board[1][1].equals(" ")) ||
						(Board.board[2][0].equals(Board.board[2][1]) && Board.board[2][1].equals(Board.board[2][2]) && !Board.board[2][1].equals(" ")) ||
						(Board.board[0][0].equals(Board.board[1][0]) && Board.board[1][0].equals(Board.board[2][0]) && !Board.board[1][0].equals(" ")) ||				
						(Board.board[0][1].equals(Board.board[1][1]) && Board.board[1][1].equals(Board.board[2][1]) && !Board.board[1][1].equals(" ")) ||
						(Board.board[0][2].equals(Board.board[1][2]) && Board.board[1][2].equals(Board.board[2][2]) && !Board.board[1][2].equals(" ")) ||
						(Board.board[0][0].equals(Board.board[1][1]) && Board.board[1][1].equals(Board.board[2][2]) && !Board.board[1][1].equals(" ")) ||
						(Board.board[0][2].equals(Board.board[1][1]) && Board.board[1][1].equals(Board.board[2][0]) && !Board.board[1][1].equals(" ")))
						{						
						System.out.println("Winner Winner Chicken Dinner!");
						System.exit(0);
						}
					}	

			

	}
