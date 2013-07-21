package com.fightthetoast.superstore.screen.window;

import org.isjaki.util.vec2f;

import com.fightthetoast.superstore.Isle;
import com.fightthetoast.superstore.screen.ScreenInGame;

public class IGWStoreOverview extends IngameWindow{

	
	private boolean showFront = true;
	
	public IGWStoreOverview(ScreenInGame sig) {
		super(sig);
	}

	@Override
	public void render() {
		
		int c = 10;
		for(Isle i : sig.isles)
		{
			drawIsle(i,120+(40*c), 320);
		
		}
	}
	
	
	private void drawIsle(Isle isle, int x, int y)
	{
		sig.game.sheetTiles.render(new vec2f(x, y), new vec2f(0,0), 0);
		sig.game.sheetTiles.render(new vec2f(x, y+32), new vec2f(0,1), 0);
		sig.game.sheetTiles.render(new vec2f(x+32, y), new vec2f(1,0), 0);
		sig.game.sheetTiles.render(new vec2f(x+32, y+32), new vec2f(1,1), 0);
		if(isle.hasIsleSign())
			sig.game.sheetTiles.render(new vec2f(x+42, y-10), new vec2f(3,0), 0);
	}

}
