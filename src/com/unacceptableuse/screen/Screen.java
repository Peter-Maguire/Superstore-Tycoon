package com.unacceptableuse.screen;

import java.util.ArrayList;

public abstract class Screen
{
	protected String title;
	protected Screen returnScreen;
	protected ArrayList<Button> buttons;
	public Screen(String title, Screen returnScreen)
	{
		this.title = title;
		this.returnScreen = returnScreen;
	}
	
	public void addButton(Button button)
	{
		if(buttons == null)
			buttons = new ArrayList<Button>(); //Don't create a new array until someone actually needs the button.
		buttons.add(button);
	}
	
	/**
	 * Called every tick, only for rendering things
	 */
	public abstract void render();
	/**
	 * Called every tick, not for rendering things
	 */
	public abstract void tick();
	/**
	 * Called when the screen is created
	 */
	public abstract void init();
	/**
	 * Called when the screen is changed
	 */
	public abstract void onExit(); 
	
	/**
	 * Called when a button is pressed
	 * @param action
	 */
	public abstract void buttonAction(String action);
	
	public void mouseMoved(int oldx, int oldy, int newx, int newy){};
	
}
