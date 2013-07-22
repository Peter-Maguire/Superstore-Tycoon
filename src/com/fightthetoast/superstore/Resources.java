package com.fightthetoast.superstore;

import org.isjaki.Loader;
import org.isjaki.graphics.BitmapFont;
import org.isjaki.graphics.Spritesheet;
import org.isjaki.graphics.Texture;

public class Resources {

	public static Texture texUI, texTiles, splash, texFont, backdrop;
	public static Spritesheet sheetUI, sheetTiles, sheetFont;
	public static BitmapFont font;
	
	
	public static void init()
	{
		splash = Loader.texture("res/loading.png");
		texUI = Loader.texture("res/ui.png");
		texTiles = Loader.texture("res/tiles.png");
		backdrop = Loader.texture("res/backdrop.png");
		texFont = Loader.texture("res/simple_6x8.png");
		sheetFont = new Spritesheet(texFont, 6, 8);
		font = new BitmapFont(sheetFont, 32);
		sheetUI = new Spritesheet(texUI,32,32);
		sheetTiles = new Spritesheet(texTiles,32,32);
	}
	

}
