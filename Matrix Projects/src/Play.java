import java.util.Scanner;
public class Play
	{
static boolean gameNotFinished= true;
		public static void main(String[] args)
			{
				
				Board.prepareBoard();
				Board.displayBoard();
				
			while(gameNotFinished)
				{
					User.X();
					Check.isWonGame();
					Board.displayBoard();
					User.O();
					Check.isWonGame();
					Board.displayBoard();
			}

	}
}