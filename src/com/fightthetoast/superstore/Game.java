package com.fightthetoast.superstore;

import org.isjaki.GameBase;
import org.isjaki.Loader;
import org.isjaki.graphics.Spritesheet;
import org.isjaki.graphics.Texture;

import com.fightthetoast.superstore.screen.Screen;
import com.fightthetoast.superstore.screen.ScreenInGame;
import com.fightthetoast.superstore.screen.ScreenMainSplash;

public class Game extends GameBase{
	

	public static final int DEFAULT_WIDTH = 800, DEFAULT_HEIGHT = 600;
	public static final String GAME_TITLE = "Superstore Tycoon";
	
	protected Screen currentScreen = null;
	
	

	
	
	public Game(String name, int width, int height) {
		super(name, width, height);
		start();
	}

	
	public static void main(String[] args)
	{
		new Game(GAME_TITLE, DEFAULT_WIDTH, DEFAULT_HEIGHT);
	}
	
	@Override
	protected void init()
	{
		System.out.println("Loading textures...");
		
		Resources.init();
		setScreen(new ScreenMainSplash(this));
		render();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
		System.out.println("Done!");
		setScreen(new ScreenInGame(this));
		
		
	}
	
	@Override
	protected void update()
	{
		
	}
	
	
	
	@Override
	protected void render()
	{
		currentScreen.render();
	}
	
	
	protected void setScreen(Screen screen)
	{
		if(currentScreen != null)
		currentScreen.onScreenDestroy(screen);
		screen.onScreenCreate(currentScreen);
		currentScreen = screen;
		render();

	}

	
	
	
	
	
}
