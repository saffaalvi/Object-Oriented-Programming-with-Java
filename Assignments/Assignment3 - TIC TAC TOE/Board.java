/**a board has or contains 9 blocks in a 2D array (3x3) (gameBoard)
 * maintains a state which can be one of the following: EMPTY (the initial state of the board), X (X claims a win), Y (Y claims a win), 
 * or DRAW (where neither X nor Y can claim a win and no further moves are possible).  
 * It checks for a win or a draw when they occur. board instantiates and maintains all the blocks.
 * Assignment 3
 * December 1, 2019
 *
 */
public class Board implements Global
{
	 public Block[][] blocks = new Block[3][3]; //creates 2D array for gameboard (3x3)
	 private int state = EMPTY;					//initial state of board is empty
	 
	 /**
	  * default constructor: sets new block for each index of array 
	  */
	 public Board()			
	 {
		 for (int i=0; i<3; i++)
			 for (int j=0; j<3; j++)
				 blocks[i][j] = new Block();	
	 }
	 /**
	  * 
	  * @return current state of board 
	  */
	 public int getState()
	 {
		 return this.updateState();
	 }
	 /**
		 * method checks if there is a win in any of the rows 
		 * @param x
		 * @return
		 */
	 private int checkRow(int x)
	 {
		 if (this.blocks[x][0].getState()!=EMPTY && this.blocks[x][0].getState() == this.blocks[x][1].getState() && this.blocks[x][1].getState() == this.blocks[x][2].getState())
			 return this.blocks[x][0].getState();
		 else
			 return 0;
	 }
	 
	/**
	 * method checks if there is a win in any of the columns 
	 * @param x
	 * @return state of block (X or O)
	 */
	 private int checkCol(int x)
	 {
		 if (this.blocks[0][x].getState()!=EMPTY && this.blocks[0][x].getState() == this.blocks[1][x].getState() && this.blocks[1][x].getState() == this.blocks[2][x].getState())
			 return this.blocks[0][x].getState();
		 else
			 return 0;
	 }
	
	 /**
	  * checks for a win in the diagonals
	  * @return state of block (X or O)
	  */
	 private int checkDiagonals()
	 {
		 if (this.blocks[0][0].getState()!=EMPTY && this.blocks[0][0].getState()==this.blocks[1][1].getState() && this.blocks[1][1].getState()==this.blocks[2][2].getState()) 
	         return this.blocks[0][0].getState();
	     else 
	     {
	    	 if (this.blocks[0][2].getState()!=EMPTY && this.blocks[0][2].getState() == this.blocks[1][1].getState() && this.blocks[1][1].getState() == this.blocks[2][0].getState())
	    	 {
	    		 return this.blocks[0][2].getState();
	    	 }
	    	 else
	    		 return 0;
	     }
	 }
	 /**
	  * checks for a draw
	  * @return state of block (X or O)
	  */
	 private int checkDraw()
	 {
		 for(int i = 0; i<3; i++) 
	         for(int j = 0; j<3; j++) 
	            if (this.blocks[i][j].getState() == 0) 
	            {
	               return 0;
	            }
	      return Draw;
	 }
	 
	 /**
	  * displays board
	  */
	 public void displayPlayerSelectionBoard()
	 {
		 int x=1;
		 for (int i=0; i<3; i++) 
		 {
			 for (int j=0; j<3; j++)
			 {
				 if(this.blocks[i][j].getState()==0)
				 {
					 System.out.print(x);
				 }
					 
				 else 
					 System.out.print(this.blocks[i][j]);
				 x++;
				 if (j!=2)
					 System.out.print("|");
			 }
			 System.out.println("");
		 }
	 }
	 public boolean makeMove(int a, int b)
	 {
		  int row = 0;
	      int column = 0;
	      
	      if (a > 0 && a < 10) 
	      {
	         if (a == 1) 
	         {
	            row = 0;
	            column = 0;
	         }

	         if (a == 2) 
	         {
	            row = 0;
	            column = 1;
	         }

	         if (a == 3)
	         {
	            row = 0;
	            column = 2;
	         }

	         if (a == 4) 
	         {
	            row = 1;
	            column = 0;
	         }

	         if (a == 5) 
	         {
	            row = 1;
	            column = 1;
	         }

	         if (a == 6) 
	         {
	            row = 1;
	            column = 2;
	         }

	         if (a == 7) 
	         {
	            row = 2;
	            column = 0;
	         }

	         if (a == 8) 
	         {
	            row = 2;
	            column = 1;
	         }

	         if (a == 9) 
	         {
	            row = 2;
	            column = 2;
	         }

	         if (this.blocks[row][column].getState() == 0) 
	         {
	            this.blocks[row][column].setState(b);
	            return true;
	         } 
	         else 
	         {
	            return false;
	         }
	      } 
	      return false;
	 }
	 /**updates the state of the board**/
	 public int updateState()
	 {
		 int row=0, col=0, diag=0;
		 for (int i=0; i<3; i++)
		 {
			 row += this.checkRow(i);
			 col += this.checkCol(i);
		 }
		 diag = this.checkDiagonals();
		 int check = row+col+diag;
				 
	      if (check != 0) 
	      {
	         this.state = check;
	      } 
	      else 
	      {
	         this.state = this.checkDraw();
	      }
	      return this.state;
	 }
	 
}
