package com.unacceptableuse.tile;

public abstract class Tile
{

	protected String title = "Alan please add title"; 
	
	protected String type; //What the tile provides, eg "game", "drinks", "hunger", "items", "information".
	protected int appeal; //How appealing the tile is, gives it priority over other tiles of the same type. Should be out of 100
	protected boolean isPassable = false; //Can an entity go through it
	//TODO: Possible stackable tiles?
	
	private String resPath = "res/fail.png"; //The path for the sheet for this tile

	private int[] sprites = new int[4]; //0 = forwards and subsequent in the anti-clockwise direction
	//TODO: Rotation
	
	public Tile()
	{

	}
	
	public abstract void onInteract(); //TODO pass entity that is interacting

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public String getType()
	{
		return type;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	public int getAppeal()
	{
		return appeal;
	}

	public void setAppeal(int appeal)
	{
		this.appeal = appeal;
	}

	public int[] getSprites()
	{
		return sprites;
	}

	public void setSprites(int[] sprites)
	{
		this.sprites = sprites;
	}
	
	public boolean isPassable()
	{
		return isPassable;
	}

	public void setPassable(boolean isPassable)
	{
		this.isPassable = isPassable;
	}

	public String getResPath()
	{
		return resPath;
	}

	public void setResPath(String resPath)
	{
		this.resPath = resPath;
	}

	@Override
	public String toString()
	{
		return this.getTitle()+" type "+this.getType(); 
	}
}
