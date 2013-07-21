package com.fightthetoast.superstore.screen.window;

import com.fightthetoast.superstore.screen.ScreenInGame;

public abstract class IngameWindow {

	
	protected ScreenInGame sig;
	
	public IngameWindow(ScreenInGame sig)
	{
		this.sig = sig;
	}
	
	public abstract void render();
	
}
