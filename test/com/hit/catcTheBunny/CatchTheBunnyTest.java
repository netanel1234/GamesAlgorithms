package com.hit.catcTheBunny;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.hit.gameAlgo.GameBoard.GameMove;
import com.hit.games.CatchTheBunny;
import com.hit.games.CatchTheBunnyRandom;

class CatchTheBunnyTest {

	@Test
	void test() {
		CatchTheBunny game1=new CatchTheBunnyRandom(9,9);
		
		assertTrue(game1.updatePlayerMove(new GameMove(8,5)));
		
	}

}
