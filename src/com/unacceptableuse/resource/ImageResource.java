package com.unacceptableuse.resource;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class ImageResource
{
	public static Image vendingMachineF;
	
	public static void init() throws SlickException
	{
		vendingMachineF = new Image("res/vending_machine_1.png");
	}
}
