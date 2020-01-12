/**block represents a playable cell and maintains a state attribute that is either EMPTY, occupied by X, or occupied by O) . 
 By default it is EMPTY, would require setState, getState, and a toString where EMPTY is just a blank space.*
 * Assignment 3
 * December 1, 2019
 */

public class Block implements Global 
{
	public int state;
	
	/**default constructor**/
	public Block()
	{
		this.state=EMPTY;	//initial state set to empty
	}
	
	/**sets the state to X or O if valid**/
	public boolean setState(int a)
	{
		if (this.isValidState(a)) 
		{
	         this.state = a;
	         return true;
	    } 
		else
	         return false;
	}
	
	/**returns state**/
	public int getState()
	{
		return this.state;
	}
	
	/**checks if state is valid**/
	public boolean isValidState(int a)
	{
		 return a == 1 || a == 2;
	}
	
	/**displays X or O depending on state of block or returns an empty space**/
	public String toString()
	{
		if (this.state != EMPTY) 
		{
			if(this.state==X)
				return "x";
			else
				return "o";
	    } 
		else 
		{
			return " ";
	    }
	}
}
