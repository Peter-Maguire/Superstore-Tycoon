package com.unacceptableuse;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

import com.unacceptableuse.resource.ImageResource;
import com.unacceptableuse.resource.TileRegistry;
import com.unacceptableuse.screen.Button;
import com.unacceptableuse.screen.Screen;
import com.unacceptableuse.screen.ScreenShop;

public class Game extends BasicGame
{

	public static final String GAME_NAME = "Superstore Tycoon";
	public static final String GAME_VER = "-1";
	public static final int GAME_WIDTH = 800;
	public static final int GAME_HEIGHT = 600;
	
	public static Graphics g = null;
	
	public static Screen currentScreen = null;
	
	private static ArrayList<Button> buttons = new ArrayList<Button>();
	
	public Game(String title)
	{
		super(title);
		
	}

	@Override
	public void render(GameContainer container, Graphics g)
			throws SlickException
	{
		this.g = g;
		currentScreen.render();
		renderButtons();
		
	}
	
	private static void renderButtons()
	{
		for(Button b : buttons)
		{
			b.getBackgroundImage().draw(b.getBoundingBox().x, b.getBoundingBox().y);
			drawText(b.getText(), b.getBoundingBox().x, b.getBoundingBox().y);
		}
	}
	
	public static void addButton(Button b)
	{
		buttons.add(b);
	}
	
	public static ArrayList<Button> getButtons()
	{
		return buttons;
	}
	
	public static void clearButtons()
	{
		buttons.clear();
	}

	@Override
	public void init(GameContainer container) throws SlickException
	{
		TileRegistry.init();
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
	
	public static void drawText(String text, int x, int y)
	{
		g.drawString(text, x, y);
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
	
	public void mouseMoved(int oldx, int oldy, int newx, int newy)
	{
		currentScreen.mouseMoved(oldx, oldy, newx, newy);
	}
	public void mousePressed(int button, int x, int y)
	{
		
	}
	public void mouseReleased(int button, int x, int y)
	{
		
	}
	public void mouseWheelMoved(int change)
	{
		
	}

	
}
