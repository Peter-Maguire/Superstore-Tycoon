package com.unacceptableuse.tile;

public class TileEmpty extends Tile
{

	
	public TileEmpty()
	{
		this.setType("path");
		this.setAppeal(0);
		this.setTitle("Empty");
		this.setSprites(new int[]{0,1,2,3});
	}
	@Override
	public void onInteract()
	{
	}

}
