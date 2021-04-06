package com.hit.gameAlgo;

public interface IGameAlgo {
	
	void calcComputeerMove();
	
	boolean updatePlayerMove(GameBoard.GameMove move);
	
	IGameAlgo.GameState getGameState(GameBoard.GameMove move)

	char[][] getBoardState()

	public static enum IGameAlgo.GameState
	{
		ILLEGAL_PLAYER_MOVE, IN_PROGRESS, PLAYER_LOST, PLAYER_WON, TIE; 
		
		public static IGameAlgo.GameState[] values()
		{
			
		}
		
		public static IGameAlgo.GameState valueOf(String name)
		{
			
		}
	}

}
