package com.unacceptableuse;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

import com.unacceptableuse.resource.ImageResource;

public class Game extends BasicGame
{

	public static final String GAME_NAME = "Superstore Tycoon";
	public static final String GAME_VER = "-1";
	public static final int GAME_WIDTH = 800;
	public static final int GAME_HEIGHT = 600;
	
	public Game(String title)
	{
		super(title);
		
	}

	@Override
	public void render(GameContainer container, Graphics g)
			throws SlickException
	{
		
		ImageResource.vendingMachineF.draw(20,10);
	}

	@Override
	public void init(GameContainer container) throws SlickException
	{
		ImageResource.init();
	}

	@Override
	public void update(GameContainer container, int delta)
			throws SlickException
	{
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
