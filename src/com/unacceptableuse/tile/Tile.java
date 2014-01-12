package com.unacceptableuse.tile;

public class Tile
{

	protected String title = "Alan please add title"; 
	
	protected String type; //What the tile provides, eg "game", "drinks", "hunger", "items", "information".
	protected int appeal; //How appealing the tile is, gives it priority over other tiles of the same type.
	
	private int[] sprites = new int[4]; //0 = forwards and subsequent in the anti-clockwise direction
	
	public Tile()
	{
		
	}
}
