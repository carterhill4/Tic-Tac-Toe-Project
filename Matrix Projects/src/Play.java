import java.util.Scanner;
public class Play
	{
static boolean gameNotFinished= true;
		public static void main(String[] args)
			{
				Board.prepareBoard();
				System.out.println("X goes first. Type your coordinate.");
				Board.displayBoard();
				
			while(gameNotFinished)
				{
					User.X();
					Board.displayBoard();
					Check.isWonGame();
					
					User.O();
					Board.displayBoard();
					Check.isWonGame();
				}
			}
	}