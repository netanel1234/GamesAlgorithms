package com.hit.games;

import com.hit.gameAlgo.GameBoard;
import com.hit.gameAlgo.IGameAlgo;

public abstract class TicTacTow extends GameBoard {
	
	GameState gameState;

	public TicTacTow(int r, int c) 
	{
		super(r, c);
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++) 
			{
				board[i][j]='b';
			}
		}
		
		gameState=GameState.IN_PROGRESS;
	}
	
	public static enum BoardSigns
	{
		BLANK('b'),COMPUTER('c'),PLAYER('p');
		
		private char c;
		
		private BoardSigns(char x)
		{
			c=x;
		}
		
		public char getSign()
		{
			return c;
		}
	}
	
	public GameState getGameState(GameMove move)
	{
		if(updatePlayerMove(move))
		{
			
		}
		return gameState;
	}
	
	public boolean updatePlayerMove(GameMove move)
	{
		if(board[move.getRow()][move.getCol()]!='b')
			return false;
		else if()
		
		return false;
	}
	
	public char[][] getBoardState()
	{
		return board;
	}
	
	public void printBoard()
	{
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
/*	
	public IGameAlgo.GameState getGameState(GameBoard.GameMove move)
	{
		if(updatePlayerMove(move))
		{
			if(board[0][0]==board[0][1])
			{
				if(board[0][0]==board[0][2])
				{
					if(board[0][0]=='p')
						game_state=GameState.PLAYER_WON;
					if(board[0][0]=='c')
						game_state=GameState.PLAYER_LOST;
				}
			}
			
			if(board[1][0]==board[1][1])
			{
				if(board[1][0]==board[1][2])
				{
					if(board[1][0]=='p')
						game_state=GameState.PLAYER_WON;
					if(board[1][0]=='c')
						game_state=GameState.PLAYER_LOST;
				}
			}
			
			if(board[2][0]==board[2][1])
			{
				if(board[2][1]==board[2][2])
				{
					if(board[2][2]=='p')
						game_state=GameState.PLAYER_WON;
					if(board[2][2]=='c')
						game_state=GameState.PLAYER_LOST;
				}
			}
			
			if(board[0][0]==board[1][0])
			{
				if(board[1][0]==board[2][0])
				{
					if(board[0][0]=='p')
						game_state=GameState.PLAYER_WON;
					if(board[0][0]=='c')
						game_state=GameState.PLAYER_LOST;
				}
			}
			
			if(board[0][1]==board[1][1])
			{
				if(board[1][1]==board[2][1])
				{
					if(board[0][1]=='p')
						game_state=GameState.PLAYER_WON;
					if(board[0][1]=='c')
						game_state=GameState.PLAYER_LOST;
				}
			}
			
			if(board[0][2]==board[1][2])
			{
				if(board[1][2]==board[2][2])
				{
					if(board[2][2]=='p')
						game_state=GameState.PLAYER_WON;
					if(board[2][2]=='c')
						game_state=GameState.PLAYER_LOST;
				}
			}
			
			if(board[0][0]==board[1][1])
			{
				if(board[1][1]==board[2][2])
				{
					if(board[2][2]=='p')
						game_state=GameState.PLAYER_WON;
					if(board[2][2]=='c')
						game_state=GameState.PLAYER_LOST;
				}
			}
			
			if(board[0][2]==board[1][1])
			{
				if(board[1][1]==board[2][0])
				{
					if(board[0][2]=='p')
						game_state=GameState.PLAYER_WON;
					if(board[0][2]=='c')
						game_state=GameState.PLAYER_LOST;
				}
			}	
		}	
		else//if updatePlayerMove returns false
			game_state=GameState.ILLEGAL_PLAYER_MOVE;
		
		//check if all cells is not BLANK
		//if yes-game state is tie
		int count=0;
		for(int a=0;a<3;a++)
			for(int b=0;b<3;b++)
				if(board[a][b]!='b')
					count++;
		if(count==9)
			game_state=GameState.TIE;
		
		return game_state;
	}
	
	//"updatePlayerMove" Updates the player's move on the board
	//in case that the move is illegal - nothing is done
	//move - the player's move
	//Returns true if the move is legal and false otherwise
	public boolean updatePlayerMove(GameBoard.GameMove move)
	{
		if(move.getRow()>2||move.getRow()<0||move.getColumn()>2||move.getColumn()<0)
			return false;
		if(board[move.getRow()][move.getColumn()]!='b')
			return false;
		board[move.getRow()][move.getColumn()]='p';
		return true;
	}
}
*/