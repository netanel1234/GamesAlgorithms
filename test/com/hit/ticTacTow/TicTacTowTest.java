package com.hit.ticTacTow;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.hit.gameAlgo.GameBoard.GameMove;
import com.hit.gameAlgo.IGameAlgo.GameState;
import com.hit.games.TicTacTow;
import com.hit.games.TicTacTowRandom;
import com.hit.games.TicTacTowSmart;

class TicTacTowTest {
	
	TicTacTow random,smart;
	
	@BeforeEach
	void setUp()
	{
		random=new TicTacTowRandom(3,3);
		smart=new TicTacTowSmart(3,3);
	}
	
	@Test
	void setUpsTest()
	{
		System.out.println("setUpsTest");
		System.out.println();
		
		/*---Random---*/
		random.printBoard();
		assertEquals(GameState.IN_PROGRESS,random.gameState);
		
		/*---Smart---*/
		smart.printBoard();
		assertEquals(GameState.IN_PROGRESS,smart.gameState);
	}

	@Test
	void playerWonTest()
	{
		System.out.println("playerWonTest");
		System.out.println();
		
		/*---Random---*/
		assertEquals(GameState.IN_PROGRESS,random.getGameState(new GameMove(0,2)));
		random.printBoard();
		assertEquals(GameState.IN_PROGRESS,random.getGameState(new GameMove(1,2)));
		random.printBoard();
		assertEquals(GameState.PLAYER_WON,random.getGameState(new GameMove(2,2)));
		random.printBoard();
		
		/*---Smart---*/
		assertEquals(GameState.IN_PROGRESS,smart.getGameState(new GameMove(0,2)));
		smart.printBoard();
		assertEquals(GameState.IN_PROGRESS,smart.getGameState(new GameMove(1,2)));
		smart.printBoard();
		assertEquals(GameState.PLAYER_WON,smart.getGameState(new GameMove(2,2)));
		smart.printBoard();
	}
	
	@Test
	void playerLostTest()
	{
		


	}
	
	@Test
	void tieGameTest()
	{
		System.out.println("tieGameTest");
		System.out.println();
		
		assertEquals(GameState.IN_PROGRESS,smart.getGameState(new GameMove(0,0)));
		assertEquals(GameState.IN_PROGRESS,smart.getGameState(new GameMove(1,1)));
		assertEquals(GameState.IN_PROGRESS,smart.getGameState(new GameMove(2,0)));
		assertEquals(GameState.IN_PROGRESS,smart.getGameState(new GameMove(1,2)));
		random.calcComputerMove();
		random.calcComputerMove();
		random.calcComputerMove();
		random.calcComputerMove();
		//find the last place he is blank.
		int x=0,y=0;
		for(int i=0;i<random.row;i++)
		{
			for(int j=0;j<random.col;j++)
			{
				if(random.board[i][j]=='b')
				{
					x=i;
					y=j;
				}
			}
		}
		random.printBoard();
		System.out.println("x="+x+" y="+y);
		assertEquals(GameState.IN_PROGRESS,smart.getGameState(new GameMove(x,y)));
		random.printBoard();
	}
	
	@Test
	void illegalPlayerMoveTest()
	{
		System.out.println("illegalPlayerMoveTest");
		System.out.println();
		
		/*---Random---*/
		assertEquals(GameState.IN_PROGRESS,random.getGameState(new GameMove(0,0)));
		random.printBoard();
		assertEquals(GameState.ILLEGAL_PLAYER_MOVE,random.getGameState(new GameMove(0,0)));

	}
	
	@Test
	void calcComputerMoveTest()
	{
		System.out.println("calcComputerMoveTest");
		System.out.println();
		
		/*---Random---*/
		random.calcComputerMove();
		random.printBoard();
		random.calcComputerMove();
		random.printBoard();
		random.calcComputerMove();
		random.printBoard();
		random.calcComputerMove();
		random.printBoard();
		random.calcComputerMove();
		random.printBoard();
		random.calcComputerMove();
		random.printBoard();
		random.calcComputerMove();
		random.printBoard();
		random.calcComputerMove();
		random.printBoard();
		random.calcComputerMove();
		random.printBoard();
		
		/*---Smart---*/
		smart.calcComputerMove();
		smart.printBoard();
		smart.calcComputerMove();
		smart.printBoard();
		smart.calcComputerMove();
		smart.printBoard();
		smart.calcComputerMove();
		smart.printBoard();
		smart.calcComputerMove();
		smart.printBoard();
		smart.calcComputerMove();
		smart.printBoard();
		smart.calcComputerMove();
		smart.printBoard();
		smart.calcComputerMove();
		smart.printBoard();
		smart.calcComputerMove();
		smart.printBoard();
		
	}
	
	

}
