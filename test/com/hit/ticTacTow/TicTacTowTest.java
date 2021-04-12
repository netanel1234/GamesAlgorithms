package com.hit.ticTacTow;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.hit.games.TicTacTow;
import com.hit.games.TicTacTowRandom;

class TicTacTowTest {

	@Test
	void test() 
	{
		TicTacTow random=new TicTacTowRandom(3,3);
		
		random.printBoard();
	}

}
