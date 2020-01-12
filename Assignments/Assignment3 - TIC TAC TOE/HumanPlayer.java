/**
 * extends player, a type of player that requests its input from the user and submit the move (or play) to the gameBoard.
 * Assignment 3
 * December 1, 2019
 */
class HumanPlayer extends Player implements Global
{
	/**overloaded constructor**/
	public HumanPlayer(Board a, int b, String c)
	{
		super(a, b, c);
	}
	/**gets move from user, tells user if its an illegal move and lets them try again**/
	public void play(Board a)
	{
		super.gameBoard = a;
		boolean valid = false;
	    while (valid==false)
	    {
	        System.out.println("Please enter your move by selecting a number from the board: ");
	        a.displayPlayerSelectionBoard();	//displays board
	        int move = sc.nextInt();			//player's move
	        valid = a.makeMove(move, this.playerSymbol);
	        if (valid==false) 
	        {
	           System.out.println("Invalid move! try again...");
	        }
	    }
	}
}
