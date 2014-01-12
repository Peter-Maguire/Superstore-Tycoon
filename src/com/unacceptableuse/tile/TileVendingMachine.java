package com.unacceptableuse.tile;

public class TileVendingMachine extends Tile
{
	
	protected int stock = 0; // How many items are left
	
	public TileVendingMachine()
	{
		this.setType("drinks");
		this.setAppeal(30);
		this.setTitle("Vending Machine");
		this.setSprites(new int[]{0,1,2,3});
		this.setResPath("res/vending_machine_1.png");
	}

	@Override
	public void onInteract()
	{
		stock--; //TODO: This will be more complicated
	}
}
