package com.fightthetoast.superstore.screen.window;

import org.isjaki.util.vec2f;

import com.fightthetoast.superstore.Game;
import com.fightthetoast.superstore.Resources;
import com.fightthetoast.superstore.screen.ScreenInGame;

public abstract class IngameWindow {

	
	protected ScreenInGame sig;
	
	public IngameWindow(ScreenInGame sig)
	{
		this.sig = sig;
	}
	
	public abstract void render();
	
	public void drawWhiteBackground()
	{
		/*for(int x = 0; x < Game.DEFAULT_WIDTH/32; x++)
		{
			for(int y = 0; y < Game.DEFAULT_HEIGHT+32/32; y++)
			{
				Resources.sheetUI.render(new vec2f(x*32, y*32),new vec2f(2,1));
			}
		}*/
	}
	
	public void drawGUIBox()
	{
		/*for(int x = 0; x < Game.DEFAULT_WIDTH-400/32; x++)
		{
			for(int y = 0; y < Game.DEFAULT_HEIGHT-132/32; y++)
			{
				Resources.sheetUI.render(new vec2f(x*32, y*32),new vec2f(8,1));
			}
		}*/
	}
	
}
