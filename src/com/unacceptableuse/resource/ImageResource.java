package com.unacceptableuse.resource;

import java.util.HashMap;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

import com.unacceptableuse.tile.Tile;

public class ImageResource
{
	//OBJECTS
	public static HashMap<String, Image> tiles = new HashMap<String, Image>(); //FIXME: Hashmaps are bad and you should feel bad
	
	//SCENERY
	public static Image tile;
	public static Image tileSelected;
	public static Image tileEntrance;
	
	
	//UI
	
	public static void init() throws SlickException
	{
		
		for(Tile t : TileRegistry.tiles)
		{
			 tiles.put(t.getClass().getName(), new Image(t.getResPath()));
		}
		
		tile = new Image("res/floor.png");
		tileSelected = new Image("res/floor_selected.png");
		tileEntrance = new Image("res/floor_entrance_1.png");
	}
}
