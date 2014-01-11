package com.unacceptableuse.screen;

import com.unacceptableuse.resource.ImageResource;

public class ScreenShop extends Screen
{

	public int floorWidth = 10;
	public int floorLength = 10;
	
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
				ImageResource.tile.draw(350+(y-y*30+(x*29)), 200+(y*15+(x*15)));
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
	}

	@Override
	public void onExit()
	{
	}

}
