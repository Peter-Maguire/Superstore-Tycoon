package com.unacceptableuse.screen;

import java.awt.Rectangle;
import java.util.Random;

import com.unacceptableuse.Game;
import com.unacceptableuse.resource.ImageResource;
import com.unacceptableuse.tile.Tile;
import com.unacceptableuse.tile.TileEmpty;
import com.unacceptableuse.tile.TileVendingMachine;

public class ScreenShop extends Screen
{

        public int floorWidth = 10;
        public int floorLength = 10;
        
        public int entranceX = 8;
        public int entranceY = 9;
        
        public Tile[][] tiles = new Tile[floorWidth][floorLength];
        public Rectangle[][] hitboxes = new Rectangle[floorWidth][floorLength];
        
        
        public int money = 0;
        private int highlightedX = 0, highlightedY = 0;
        public Random random = new Random(); //temp random for testing

        
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
                                       // Game.drawText(x + ", " + y, 360 + (y - y * 30 + (x * 29)), 205 + (y * 15 + (x * 15)));
                                }
                                
                                if(!(tiles[x][y] instanceof TileEmpty)) //FIXME: This is not ideal
                                ImageResource.tiles.get(tiles[x][y].getClass().getName()).draw(350 + (y - y * 30 + (x * 29)), 105 + (y *15 + (x * 15)));
                         //       tiles[x][y] = random.nextInt(10) == 0 ? new TileVendingMachine() : new TileEmpty(); //Uncomment for dancing vending machines
                        }
                }
                
                
                Game.drawText("$"+money, 750, 10);
                
          

        }
        
        @Override
        public void mouseMoved(int oldx, int oldy, int newx, int newy)
        {
            for(int y = 0; y < floorWidth; y++)
            {
                    for(int x = 0; x < floorLength; x++)
                    {
                    	if(hitboxes[x][y].contains(newx, newy))
                    	{
                    		
                    		return;
                    	}
                    	
                    }
            }
        }
        
        @Override
        public void tick()
        {
        }

        @Override
        public void init()
        {
        	Button b = new Button();
        	b.setBackgroundImage(ImageResource.tile);
        	b.setAction("testAction");
        	b.setText("Text text");
        	b.setBoundingBox(new Rectangle(1, 1, 32, 32));
        	Game.addButton(b);
                for(int y = 0; y < floorWidth; y++)
                {
                        for(int x = 0; x < floorLength; x++)
                        {
                        	tiles[x][y] = y < 2 ? new TileVendingMachine() : new TileEmpty(); 
                        	hitboxes[x][y] = new Rectangle(x, y,16,16);
                        }
                }
        }

        @Override
        public void onExit()
        {
        }
        
        

}