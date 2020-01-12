/**extends player, a type of player that implements a simple computer player. 
 * Generates a valid random move 
 * Assignment 3
 * December 1, 2019
 *
 */
public class AIPlayer extends Player implements Global 
{
	/**overloaded constructor**/
	public AIPlayer(Board a, int b, String c) 
	{
		super(a, b, c);
	}
	/**this method makes a legal random move**/
	public void play(Board a)
	{
	    int c = this.randomLegal();		//move 
	    a.makeMove(c, this.playerSymbol);
	    System.out.println(this.playerName + ": I made my move at " + c);
	}
	private int randomLegal()
	{
		int count = 0;
	    int[] move = new int[9];	//new array of valid moves
	    for(int i=0; i<3; i++) 
	    {
	       for(int j=0; j<3; j++) 
	       {
	          if (this.gameBoard.blocks[i][j].getState() == 0) 
	          {
	             move[count++] = i*3+j+1;	//creates an array of the empty blocks 
	            }
	         }
	      }
	      return move[choose.nextInt(count)];	//chooses a move from one of the empty blocks (valid move)**/
	
	}

	
}