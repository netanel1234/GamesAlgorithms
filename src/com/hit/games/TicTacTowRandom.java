package com.hit.games;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TicTacTowRandom extends TicTacTow {

	public TicTacTowRandom(int r, int c) 
	{
		super(r, c);
	}

	@Override
	public void calcComputerMove() 
	{
		List<Integer> list=new ArrayList<>();
		int place=0;
		int newPlace;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(board[i][j]=='b')
					list.add(place);
				place++;
			}
		}
		System.out.println("this is the list of blank cells. in cacComputerMove--"+list);
		place=0;
		newPlace=getRandomElement(list);
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(place==newPlace)
					board[i][j]='c';
				place++;
			}
		}
	}
	
	public int getRandomElement(List<Integer> list)
	{
		Random rand=new Random();
		return list.get(rand.nextInt(list.size()));
	}
	
	public boolean updatePlayerMove(GameMove move)
	{
		return super.updatePlayerMove(move);
	}
	

}
