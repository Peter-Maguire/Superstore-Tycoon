package com.fightthetoast.superstore.screen;

import java.util.ArrayList;

import org.isjaki.util.vec2f;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

import com.fightthetoast.superstore.Game;
import com.fightthetoast.superstore.Isle;
import com.fightthetoast.superstore.Resources;
import com.fightthetoast.superstore.screen.window.IGWIsleEditor;
import com.fightthetoast.superstore.screen.window.IGWStoreOverview;
import com.fightthetoast.superstore.screen.window.IngameWindow;

public class ScreenInGame extends Screen{

	
	
	private int monies = 0, moniesToAdd = 0;
	public ArrayList<Isle>isles = new ArrayList<Isle>();
	private IngameWindow currentWindow;
	private String shopName = "Untitled Shop"; //Shop name can only be 13 Characters long

	
	public ScreenInGame(Game game) {
		super(game);
	}

	@Override
	public void onScreenCreate(Screen previousScreen) {
		//Load map
		isles.add(new Isle(true,true,"Test Isle"));
		isles.add(new Isle(false,true,"Test Isle1"));
		isles.add(new Isle(true,false,"Test Isle2"));
		isles.add(new Isle(false,false,"Test Isle3"));
	
		setWindow(new IGWIsleEditor(this));
		monies = 900;
		addMonies(100);
	}

	
	public void render() {
		GL11.glClear(GL11.GL_COLOR_BUFFER_BIT);

		Resources.backdrop.render(new vec2f(0,0));
		int c = 0;
		for(Isle i : isles)
		{	
			
			drawIsle(i,300+(40*c), 290+c*15);
			c++;
		
		}
		
		if(currentWindow != null)currentWindow.render();
		
		
		drawOverlay();

	}
	
	private void drawIsle(Isle isle, int x, int y)
	{
		Resources.sheetTiles.render(new vec2f(x, y), new vec2f(0,0), 0);
		Resources.sheetTiles.render(new vec2f(x, y+32), new vec2f(0,1), 0);
		Resources.sheetTiles.render(new vec2f(x+32, y), new vec2f(1,0), 0);
		Resources.sheetTiles.render(new vec2f(x+32, y+32), new vec2f(1,1), 0);
		//if(isle.hasIsleSign())
			//Resources.sheetTiles.render(new vec2f(x+42, y-10), new vec2f(3,0), 0);
	}
	
	
	private void drawOverlay()
	{
		Resources.sheetUI.render(new vec2f(700,10), new vec2f(0,0));
		Resources.sheetUI.render(new vec2f(732,10), new vec2f(1,0));
		Resources.sheetUI.render(new vec2f(764,10), new vec2f(2,0));
		Resources.sheetUI.render(new vec2f(760,10), new vec2f(3,0));
		Resources.sheetUI.render(new vec2f(328,0), new vec2f(4,0));
		Resources.sheetUI.render(new vec2f(360,0), new vec2f(5,0));
		Resources.sheetUI.render(new vec2f(392,0), new vec2f(6,0));
		Resources.font.render(monies+"", new vec2f(710,22));
		Resources.font.render(shopName, new vec2f(336,10));

	}

	@Override
	public void onScreenDestroy(Screen newScreen) {
		//TODO: Save game
		
	}
	
	
	public void setWindow(IngameWindow newWindow)
	{
		currentWindow = newWindow;
	}
	
	public void addMonies(int amount)
	{
		moniesToAdd += amount;
	}

	@Override
	public void tick() {
		if(moniesToAdd != 0)
		{
			if(moniesToAdd > 0)
			{
			monies++;
			moniesToAdd--;
			}else
			{
			 monies--;
			 moniesToAdd++;
			}
		
		}
		
	}

}
