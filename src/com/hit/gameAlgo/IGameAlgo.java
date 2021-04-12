package com.hit.gameAlgo;

public interface IGameAlgo {
	
	void calcComputerMove();
	
	boolean updatePlayerMove(GameBoard.GameMove move);
	
	GameState getGameState(GameBoard.GameMove move);

	char[][] getBoardState();

	public static enum GameState
	{
		ILLEGAL_PLAYER_MOVE, IN_PROGRESS, PLAYER_LOST, PLAYER_WON, TIE; 
	}

}
