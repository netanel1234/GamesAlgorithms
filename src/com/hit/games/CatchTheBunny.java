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
		
	}
	
}
