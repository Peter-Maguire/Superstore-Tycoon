package com.fightthetoast.superstore;

import org.isjaki.Base2DGame;

import com.fightthetoast.superstore.screen.Screen;

public class Game extends Base2DGame{

	
	public static final int DEFAULT_WIDTH = 800, DEFAULT_HEIGHT = 600;
	public static final String GAME_TITLE = "Superstore Tycoon";
	
	protected Screen currentScreen = null;
	
	
	public Game(String name, int width, int height, boolean vsync,
			boolean resizable) {
		super(name, width, height, vsync, resizable);
		this.start();
	}
	
	
	public static void main(String[] args)
	{
		new Game(Game.GAME_TITLE, DEFAULT_WIDTH, DEFAULT_HEIGHT, true, true);
	}
	
	@Override
	protected void init()
	{
		
	}
	
	
	@Override
	protected void render()
	{
		currentScreen.render();
	}
	
	
	protected void setScreen(Screen screen)
	{
		currentScreen.onScreenDestroy();
		currentScreen = screen;
		currentScreen.onScreenCreate();
	}

	
	
	
	
	
}
