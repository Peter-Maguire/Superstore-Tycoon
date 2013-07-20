package com.fightthetoast.superstore.screen;

import com.fightthetoast.superstore.Game;

public abstract class Screen {

	
	protected Game game;
	public void Screen(Game game)
	{
		this.game = game;
	}
	
	
	public abstract void onScreenCreate(Screen previousScreen);
	public abstract void render();
	public abstract void onScreenDestroy(Screen newScreen);
	
}
