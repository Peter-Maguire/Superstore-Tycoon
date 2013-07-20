package com.fightthetoast.superstore.screen;

import com.fightthetoast.superstore.Game;

public class Screen {

	
	protected Game game;
	public void Screen(Game game)
	{
		this.game = game;
	}
	
	
	public void onScreenCreate(){}
	public void render(){}	
	public void onScreenDestroy(){}
	
}
