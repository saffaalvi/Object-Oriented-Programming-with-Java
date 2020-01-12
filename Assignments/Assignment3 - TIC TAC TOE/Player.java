/** abstract class - maintains a design that every player has a symbol (X or O), a name, and an abstract play(board gameBoard) method. 
 * It also maintains a reference to the game board for players to examine and make their move.
 * Assignment 3
 * December 1, 2019
 *
 */
public abstract class Player 
{
	public Board gameBoard = new Board();
	public String playerName;
	public int playerSymbol;
	
	/**overloaded constructor**/
	public Player(Board a, int b, String c)
	{
		this.gameBoard = a;
		this.playerSymbol = b;
		this.playerName = c;
	}
	
	public abstract void play(Board a);	//abstract method

	/**returns players name**/
	public String toString()	
	{
		return this.playerName;
	}
}
