package com.unacceptableuse.resource;

import java.util.ArrayList;

import com.unacceptableuse.tile.Tile;
import com.unacceptableuse.tile.TileEmpty;
import com.unacceptableuse.tile.TileVendingMachine;

public class TileRegistry
{
	public static ArrayList<Tile> tiles = new ArrayList<Tile>();;

	public static void init()
	{
		tiles.add(new TileVendingMachine());
		tiles.add(new TileEmpty());

	}
}
