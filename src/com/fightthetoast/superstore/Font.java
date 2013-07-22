package com.fightthetoast.superstore;

import java.util.HashMap;

import org.isjaki.graphics.Spritesheet;
import org.isjaki.graphics.Texture;
import org.isjaki.util.vec2f;

public class Font {


	private static final String font = " !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_'abcdefghijklmnopqrstuvwxyz{|}";
	private Spritesheet fontsheet;
	private HashMap<String, Texture> sheet = new HashMap<String, Texture>();
	
	public Font(Spritesheet fontsheet)
	{
		this.fontsheet = fontsheet;
		
		for(int i = 0; i < font.length(); i++)
		{
			//sheet.put(font.charAt(i).toString(), fontsheet.getTexture().);
		}
	}
	
	
	
	public void drawString(String text, int x, int y)
	{
		for(int i = 0; i < text.length(); i++)
		{
			for(int k = 0; k < font.length(); k++)
			{
				if(text.charAt(i)==font.charAt(k) && text.charAt(i) != " ".charAt(0))
				{
					fontsheet.render(new vec2f(x+(i*6),y), new vec2f(k,0));
				}
					
				
				
			}
				
			
		}
	}
}
