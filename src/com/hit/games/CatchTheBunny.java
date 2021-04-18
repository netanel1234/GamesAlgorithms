package com.hit.games;

import com.hit.gameAlgo.GameBoard;
import com.hit.gameAlgo.IGameAlgo.GameState;

public abstract class CatchTheBunny extends GameBoard {
	
	public GameState gameState;

	public CatchTheBunny(int r, int c) 
	{
		super(r, c);
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++) 
			{
				board[i][j]='b';
			}
		}
		board[0][4]='c';
		board[8][4]='p';
		
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
		gameState=GameState.IN_PROGRESS;
		if(updatePlayerMove(move))
		{
			
		}
		
		
		return gameState;
	}
	
	
	//updatePlayerMove Updates the player's move on the board. in case the move is not legal - nothing is done
	//Returns: true if the move is legal and false otherwise
	public boolean updatePlayerMove(GameBoard.GameMove move)
	{
		if(board[move.getRow()][move.getCol()]=='p')
			return false;
		
		try {
			if(board[move.getRow()+1][move.getCol()]=='p')
			{
				board[move.getRow()+1][move.getCol()]='p';
				board[move.getRow()][move.getCol()]='b';
				return true;
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			try {
				if(board[move.getRow()][move.getCol()+1]=='p')
				{
					board[move.getRow()][move.getCol()+1]='p';
					board[move.getRow()][move.getCol()]='b';
					return true;
				}
			}
			catch(ArrayIndexOutOfBoundsException ee) {
				try {
					if(board[move.getRow()][move.getCol()-1]=='p')
					{
						board[move.getRow()][move.getCol()-1]='p';
						board[move.getRow()][move.getCol()]='b';
						return true;
					}
				}
				catch(ArrayIndexOutOfBoundsException eee) {
					try {
						if(board[move.getRow()-1][move.getCol()]=='p')
						{
							board[move.getRow()-1][move.getCol()]='p';
							board[move.getRow()][move.getCol()]='b';
							return true;
						}
					}
					catch(ArrayIndexOutOfBoundsException eeee) {
						
					}
				}
			}
		}
		
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
