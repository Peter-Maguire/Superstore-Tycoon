package com.fightthetoast.superstore.screen;

import com.fightthetoast.superstore.Game;

public abstract class Screen {

	
	public Game game;
	
	public Screen(Game game)
	{
		this.game = game;
	}
	
	
	public abstract void onScreenCreate(Screen previousScreen);
	public abstract void render();
	public abstract void onScreenDestroy(Screen newScreen);
	
}
