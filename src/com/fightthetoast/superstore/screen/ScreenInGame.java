package com.fightthetoast.superstore.screen;

import java.util.ArrayList;

import org.isjaki.util.vec2f;
import org.lwjgl.opengl.GL11;

import com.fightthetoast.superstore.Game;
import com.fightthetoast.superstore.Isle;
import com.fightthetoast.superstore.screen.window.IGWStoreOverview;
import com.fightthetoast.superstore.screen.window.IngameWindow;

public class ScreenInGame extends Screen{

	
	
	private int monies = 0;
	public ArrayList<Isle>isles = new ArrayList<Isle>();
	private IngameWindow currentWindow;
	
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
	
		setWindow(new IGWStoreOverview(this));
	}

	
	public void render() {
		GL11.glClear(GL11.GL_COLOR_BUFFER_BIT);
		currentWindow.render();
		drawOverlay();
	}
	
	
	private void drawOverlay()
	{
		game.sheetUI.render(new vec2f(700,10), new vec2f(0,0));
		game.sheetUI.render(new vec2f(732,10), new vec2f(1,0));
		game.sheetUI.render(new vec2f(764,10), new vec2f(2,0));
		game.sheetUI.render(new vec2f(760,10), new vec2f(3,0));
		game.font.drawString("Test", 10, 10);
	}

	@Override
	public void onScreenDestroy(Screen newScreen) {
		//TODO: Save game
		
	}
	
	
	public void setWindow(IngameWindow newWindow)
	{
		currentWindow = newWindow;
	}

}
