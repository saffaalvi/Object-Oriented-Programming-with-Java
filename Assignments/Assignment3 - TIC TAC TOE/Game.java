/**contains a gameBoard and playerX and playerO.
 * Gets the player names, does a coin toss to decide the turn and allows each player to 
 * take a turn and make a move. It finally announces the winner/draw when the game ends.
 * Assignment 3
 * December 1, 2019
 */
public class Game implements Global
{
	Board gameBoard;			//board
	Player playerX, playerO;	//two players (X and O)
	int turn, end = 1;			//turn = which player's turn, end = when to end loop
	
	/** default constructor 
	 *  begins a new Board, prompts user for type of game and player names
	 */
	public Game()
	{
		gameBoard = new Board();					//starts a new Board
		String player1 = "1", player2 = "2";		//default name of players 
		int opt;									//option chosen by user for type of game
		
		System.out.println("WELCOME TO TIC TAC TOE!");
		
		while (end==1) 
		{
			System.out.print("Please select an option: 1-Human vs Human or 2-Human vs AI or 3-AI vs AI: ");
			opt = sc.nextInt();
			switch(opt)
			{
				case 1: 	//human vs human
					System.out.println("---HUMAN VS. HUMAN GAME---");
					sc.nextLine();
					System.out.print("Enter player X name: ");
					player1 = sc.nextLine();
					System.out.print("Enter player O name: ");
					player2 = sc.nextLine();
					playerX = new HumanPlayer(gameBoard, X, player1);		
					playerO = new HumanPlayer(gameBoard, O, player2);		
					end = 0;
					break;
				case 2:		//human vs AI
					System.out.println("---HUMAN VS. AI GAME---");
					sc.nextLine();
					System.out.print("Enter player X name: ");
					player1 = sc.nextLine();
					System.out.print("Enter AI player name: ");
					player2 = sc.nextLine();
					playerX = new HumanPlayer(gameBoard, X, player1);		
					playerO = new AIPlayer(gameBoard, O, player2);			
					end = 0;
					break;
				case 3:		//AI vs AI
					System.out.println("---AI VS. AI GAME---");
					sc.nextLine();
					System.out.print("Enter player X name: ");
					player1 = sc.nextLine();
					System.out.print("Enter player O name: ");
					player2 = sc.nextLine();
					playerX = new AIPlayer(gameBoard, X, player1);			
					playerO = new AIPlayer(gameBoard, O, player2);			
					end = 0;
					break;
				default:	//invalid option 
					System.out.println("INVALID! Try again: ");
			}
		}
		System.out.println("STARTING GAME: " + player1 + " VS. " + player2);
			
	}
	/**
	 * Randomly decides which player will start. Determines which player's turn it is. Allows each player to take a turn and make a move.
	 * Announces the winner/draw when the game ends.
	 */
	public void start() 
	{
		end = 1;
		turn = choose.nextInt(2) + 1;			//generate random number between 1 and 2 to determine who starts
		if (turn == 1)	//X starts
		{
			System.out.println("PLAYER (" + this.playerX.playerName + ") WILL START");
		}
		else			//O starts
		{
			System.out.println("PLAYER (" + this.playerO.playerName + ") WILL START");
		}
		while (end==1)
		{
			if (turn == X)
			{
				System.out.println("PlayerX (" + this.playerX.playerName + ") your turn: ");
				this.playerX.play(gameBoard);
			}
			else
			{
				System.out.println("PlayerO (" + this.playerO.playerName + ") your turn: ");
				this.playerO.play(gameBoard);
			}
			
			if (end==1)			//switches turns 
			{
				if (turn==1)
					turn=2;
				else
					turn=1;
			}
			if (this.gameBoard.getState()!=0)	//ends game
				end=0;
		}
		/**displays correct winner or draw**/
		if (this.gameBoard.getState() == Draw) 
		{
			 gameBoard.displayPlayerSelectionBoard();
	         System.out.println("SORRY! IT'S A DRAW!");
	    } 
		else if (turn == O) 
		{
			 gameBoard.displayPlayerSelectionBoard();
	         System.out.println("CONGRATS PLAYER " + this.playerX + "! YOU WIN!");
	    } 
		else 
	    {
			 gameBoard.displayPlayerSelectionBoard();
	    	 System.out.println("CONGRATS PLAYER " + this.playerO + "! YOU WIN!");
	    }
		
	}
}
