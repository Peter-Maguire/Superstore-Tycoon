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

import org.isjaki.GameBase;
import org.isjaki.Isjaki;
import org.isjaki.graphics.Color;
import org.isjaki.util.vec2f;
import org.lwjgl.LWJGLException;
import org.lwjgl.Sys;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

import com.fightthetoast.superstore.screen.Screen;
import com.fightthetoast.superstore.screen.ScreenInGame;

public class Game extends GameBase{
	

	public static final int DEFAULT_WIDTH = 800, DEFAULT_HEIGHT = 600;
	public static final String GAME_TITLE = "Superstore Tycoon";
	private boolean isFullscreen = false;
	
	protected Screen currentScreen = null;
	long lastFrame;
	int fps;
	int solidFPS;
	long lastFPS;
	

	private Color clearColor = new Color(27, 18, 23);
	
	public Game(String name, int width, int height) {
		super(name, width, height);
		start();
		
	}
	
	@Override
	public void start()
	{
		try {
			Display.setDisplayMode(new DisplayMode(SCREEN_WIDTH, SCREEN_HEIGHT));
			Display.setFullscreen(isFullscreen);
			Display.setResizable(false);
			Display.setTitle(SCREEN_NAME);
			Display.setVSyncEnabled(false);
			
			Display.create();
			Isjaki.create(Isjaki.INIT_EVERYTHING);
		} catch (LWJGLException e) {
			e.printStackTrace();
			System.exit(0);
		}
		
		init2DGL();
		init();
		
		while (!Display.isCloseRequested()) {
			getDelta();
			update();
			render();
			Display.update();
		//	Display.sync(60); // cap fps to 60fps
		}
		Display.destroy();
	}
	
	private void init2DGL() {
		glMatrixMode(GL_PROJECTION); {
			glOrtho(0, SCREEN_WIDTH, SCREEN_HEIGHT, 0, -1, 1);
			glViewport(0, 0, SCREEN_WIDTH, SCREEN_HEIGHT);
		}

		glMatrixMode(GL_MODELVIEW); {
			glClearColor(clearColor.r,
					clearColor.g, clearColor.b, 1);

			glEnable(GL_BLEND);
			glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA);
		}
		
		glLoadIdentity();
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
/*		setScreen(new ScreenMainSplash(this));
		render();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}*/
		System.out.println("Done!");
		setScreen(new ScreenInGame(this));
		
		
	}
	
	@Override
	protected void update()
	{
		currentScreen.tick();
	}	
	

	
	
	
	@Override
	protected void render()
	{
		currentScreen.render();
		updateFPS();
	}
	
	
	protected void setScreen(Screen screen)
	{
		if(currentScreen != null)
		currentScreen.onScreenDestroy(screen);
		screen.onScreenCreate(currentScreen);
		currentScreen = screen;
		render();

	}
	public long getTime() {
	    return System.nanoTime() / 1000000;
	}
	
	public int getDelta() {
	    long time = getTime();
	    int delta = (int) (time - lastFrame);
	    lastFrame = time;
	 
	    return delta;
	}
	
	public void updateFPS() {
		if (getTime() - lastFPS > 1000) {
			solidFPS = fps;
			fps = 0;
			lastFPS += 1000;
		}
		Resources.font.render(solidFPS+" FPS.", new vec2f(1,1));
		fps++;
		
		
	
	}
	
	

	
	
	
	
	
}
