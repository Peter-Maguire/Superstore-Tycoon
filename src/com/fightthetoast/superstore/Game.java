package com.fightthetoast.superstore;

import static org.lwjgl.opengl.GL11.GL_BLEND;
import static org.lwjgl.opengl.GL11.GL_MODELVIEW;
import static org.lwjgl.opengl.GL11.GL_ONE_MINUS_SRC_ALPHA;
import static org.lwjgl.opengl.GL11.GL_PROJECTION;
import static org.lwjgl.opengl.GL11.GL_SRC_ALPHA;
import static org.lwjgl.opengl.GL11.glBlendFunc;
import static org.lwjgl.opengl.GL11.glClearColor;
import static org.lwjgl.opengl.GL11.glEnable;
import static org.lwjgl.opengl.GL11.glLoadIdentity;
import static org.lwjgl.opengl.GL11.glMatrixMode;
import static org.lwjgl.opengl.GL11.glOrtho;
import static org.lwjgl.opengl.GL11.glViewport;

import org.lwjgl.LWJGLException;
import org.lwjgl.Sys;
import org.lwjgl.input.Cursor;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.opengl.ImageData;

import com.fightthetoast.superstore.screen.Screen;
import com.fightthetoast.superstore.screen.ScreenInGame;
import com.fightthetoast.superstore.screen.ScreenMainSplash;

public class Game implements org.newdawn.slick.Game{
	

	public static final int DEFAULT_WIDTH = 800, DEFAULT_HEIGHT = 600;
	public static final String GAME_TITLE = "Superstore Tycoon";
	private boolean isFullscreen = false;
	
	protected Screen currentScreen = null;
	long lastFrame;
	int fps;
	int solidFPS;
	long lastFPS;
	public GameContainer container = new GameContainer(this);
	


	public Game()
	{
		this.init();
	}



	
	public static void main(String[] args)
	{
		new Game();
	}

	
	
	protected void setScreen(Screen screen)
	{
		if(currentScreen != null)
		currentScreen.onScreenDestroy(screen);
		screen.onScreenCreate(currentScreen);
		currentScreen = screen;
		//render();

	}

	
	

	@Override
	public void init(GameContainer container) throws SlickException {
		System.out.println("Loading textures...");
		
		Resources.init();
		setScreen(new ScreenMainSplash(this));
		//render(container);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
		System.out.println("Done!");
		setScreen(new ScreenInGame(this));
		
	}


	@Override
	public void update(GameContainer container, int delta)
			throws SlickException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void render(GameContainer container, Graphics g)
			throws SlickException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public boolean closeRequested() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

	
	
	
	
	
}
