package com.unacceptableuse.screen;

public abstract class Screen
{
	protected String title;
	protected Screen returnScreen;
	public Screen(String title, Screen returnScreen)
	{
		this.title = title;
		this.returnScreen = returnScreen;
	}
	
	
	public abstract void render();
	public abstract void tick();
	public abstract void init();
	public abstract void onExit(); 
	
}
