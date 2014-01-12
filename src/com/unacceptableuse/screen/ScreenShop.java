package com.unacceptableuse.screen;

import com.unacceptableuse.Game;
import com.unacceptableuse.resource.ImageResource;
import com.unacceptableuse.tile.Tile;

public class ScreenShop extends Screen
{

	public int floorWidth = 10;
	public int floorLength = 10;
	
	public int entranceX = 8;
	public int entranceY = 9;
	
	public Tile[][] tiles = new Tile[floorWidth][floorLength];

	
	public ScreenShop(String title, Screen returnScreen)
	{
		super(title, returnScreen);
		
	}

	@Override
	public void render()
	{
		for(int y = 0; y < floorWidth; y++)
		{
			for(int x = 0; x < floorLength; x++)
			{
				if(x == entranceX && y == entranceY)
				{
					ImageResource.tileEntrance.draw(350 + (y - y * 30 + (x * 29)), 200 + (y * 15 + (x * 15)));
				}
				else
				{
					ImageResource.tile.draw(350 + (y - y * 30 + (x * 29)), 200 + (y * 15 + (x * 15)));
					Game.drawText(x + ", " + y, 360 + (y - y * 30 + (x * 29)), 205 + (y * 15 + (x * 15)));
				}
			}
		}
		
		ImageResource.vendingMachineF.draw(175, 196);

	}
	
	@Override
	public void tick()
	{
	}

	@Override
	public void init()
	{
		for(int y = 0; y < floorWidth; y++)
		{
			for(int x = 0; x < floorLength; x++)
			{
				tiles[x][y] = new Tile();
				tiles[x][y] = new Tile();
			}
		}
	}

	@Override
	public void onExit()
	{
	}

}
