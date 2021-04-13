package com.hit.ticTacTow;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.hit.gameAlgo.GameBoard.GameMove;
import com.hit.gameAlgo.IGameAlgo.GameState;
import com.hit.games.TicTacTow;
import com.hit.games.TicTacTowRandom;

class TicTacTowTest {

	@Test
	void test() 
	{
		TicTacTow game=new TicTacTowRandom(3,3);
		assertEquals(GameState.IN_PROGRESS,game.gameState);
		assertEquals(GameState.IN_PROGRESS,game.getGameState(new GameMove(0,0)));
		assertEquals(GameState.ILLEGAL_PLAYER_MOVE,game.getGameState(new GameMove(0,0)));
		assertEquals(GameState.IN_PROGRESS,game.getGameState(new GameMove(1,1)));
		assertEquals(GameState.IN_PROGRESS,game.getGameState(new GameMove(2,0)));
		game.printBoard();
		game.calcComputerMove();
		game.calcComputerMove();
		game.calcComputerMove();
		game.calcComputerMove();

		game.printBoard();


	}

}
