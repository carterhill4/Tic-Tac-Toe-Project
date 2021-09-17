import java.util.Scanner;
public class User
	{
		public static void X()
			{
				Scanner userInputX = new Scanner(System.in);
				
				String choiceX = userInputX.nextLine();
				
				if(choiceX.equals("A1"))
					{
						Board.board[0][0] = "X";
					}
				else if(choiceX.equals("A2"))
				{
					Board.board[0][1] = "X";
				}
				else if(choiceX.equals("A3"))
					{
						Board.board[0][2] = "X";
					}
				else if(choiceX.equals("B1"))
					{
						Board.board[1][0] = "X";
					}
				else if(choiceX.equals("B2"))
					{
						Board.board[1][1] = "X";
					}
				else if(choiceX.equals("B3"))
					{
						Board.board[1][2] = "X";
					}
				else if(choiceX.equals("C1"))
					{
						Board.board[2][0] = "X";
					}
				else if(choiceX.equals("C2"))
					{
						Board.board[2][1] = "X";
					}
				else if(choiceX.equals("C3"))
					{
						Board.board[2][2] = "X";
					}
			}
		public static void O()
		{
			Scanner userInputO = new Scanner(System.in);
			
			String choiceO = userInputO.nextLine();
		if(choiceO.equals("A1"))
			{
				Board.board[0][0] = "O";
			}
		else if(choiceO.equals("A2"))
		{
			Board.board[0][1] = "X";
		}
		else if(choiceO.equals("A3"))
			{
				Board.board[0][2] = "O";
			}
		else if(choiceO.equals("B1"))
			{
				Board.board[1][0] = "O";
			}
		else if(choiceO.equals("B2"))
			{
				Board.board[1][1] = "O";
			}
		else if(choiceO.equals("B3"))
			{
				Board.board[1][2] = "O";
			}
		else if(choiceO.equals("C1"))
			{
				Board.board[2][0] = "O";
			}
		else if(choiceO.equals("C2"))
			{
				Board.board[2][1] = "O";
			}
		else if(choiceO.equals("C3"))
			{
				Board.board[2][2] = "O";
			}
		}
				
}