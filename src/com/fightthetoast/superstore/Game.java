package com.fightthetoast.superstore;

import org.isjaki.GameBase;
import org.isjaki.Loader;
import org.isjaki.graphics.Texture;
import org.isjaki.util.vec2f;
import org.lwjgl.util.vector.Vector2f;

import com.fightthetoast.superstore.screen.Screen;
import com.fightthetoast.superstore.screen.ScreenMainSplash;

public class Game extends GameBase{
	

	public static final int DEFAULT_WIDTH = 800, DEFAULT_HEIGHT = 600;
	public static final String GAME_TITLE = "Superstore Tycoon";
	
	protected Screen currentScreen = null;
	
	
	public Texture splash;
	
	
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
		splash = Loader.texture("res/loading.png");
		setScreen(new ScreenMainSplash(this));
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

	}

	
	
	
	
	
}
