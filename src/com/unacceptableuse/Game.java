package com.unacceptableuse;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

import com.unacceptableuse.resource.ImageResource;
import com.unacceptableuse.screen.Screen;
import com.unacceptableuse.screen.ScreenShop;

public class Game extends BasicGame
{

	public static final String GAME_NAME = "Superstore Tycoon";
	public static final String GAME_VER = "-1";
	public static final int GAME_WIDTH = 800;
	public static final int GAME_HEIGHT = 600;
	
	public static Screen currentScreen = null;
	
	public Game(String title)
	{
		super(title);
		
	}

	@Override
	public void render(GameContainer container, Graphics g)
			throws SlickException
	{
		currentScreen.render();
	}

	@Override
	public void init(GameContainer container) throws SlickException
	{
		ImageResource.init();
		setScreen(new ScreenShop("shop name", null));
		
	}
	
	public static void setScreen(Screen screen)
	{
		if(currentScreen != null)
			currentScreen.onExit();
		currentScreen = screen;
		currentScreen.init();
	}

	@Override
	public void update(GameContainer container, int delta)
			throws SlickException
	{
		currentScreen.tick();
	}
	
	
	public static void main(String[] args)
	{
		try
		{
			AppGameContainer appgc;
			appgc = new AppGameContainer(new Game(Game.GAME_NAME));
			appgc.setDisplayMode(Game.GAME_WIDTH, Game.GAME_HEIGHT, false);
			appgc.start();
		}
		catch (SlickException ex)
		{
			Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	
}
