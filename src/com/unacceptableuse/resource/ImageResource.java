package com.unacceptableuse.resource;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class ImageResource
{
	//OBJECTS
	public static Image vendingMachineF;
	
	//SCENERY
	public static Image tile;
	public static Image tileSelected;
	public static Image tileEntrance;
	
	
	//UI
	
	public static void init() throws SlickException
	{
		vendingMachineF = new Image("res/vending_machine_1.png");
		
		tile = new Image("res/floor.png");
		tileSelected = new Image("res/floor_selected.png");
		tileEntrance = new Image("res/floor_entrance_1.png");
	}
}
