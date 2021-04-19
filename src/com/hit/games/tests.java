package com.hit.games;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import com.hit.gameAlgo.GameBoard.GameMove;
import com.hit.games.CatchTheBunny;
import com.hit.games.CatchTheBunnyRandom;

public class tests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CatchTheBunny game1=new CatchTheBunnyRandom(9,9);
		//game1.printBoard();
		game1.updatePlayerMove(new GameMove(7,4));
		game1.printBoard();
		game1.updatePlayerMove(new GameMove(8,4));
		game1.printBoard();


	}

}
