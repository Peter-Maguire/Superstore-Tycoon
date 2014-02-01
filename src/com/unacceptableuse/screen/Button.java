package com.unacceptableuse.screen;

import java.awt.Rectangle;

import org.newdawn.slick.Image;

public class Button
{

	protected Image backgroundImage = null; //TODO: Change to spritesheet so hovering works.
	protected String action = null;
	protected Rectangle boundingBox = null;
	protected String text = null;
	protected boolean hovered = false;
	
	
	public Image getBackgroundImage()
	{
		return backgroundImage;
	}
	public Button setBackgroundImage(Image backgroundImage)
	{
		this.backgroundImage = backgroundImage;
		return this;
	}
	public String getAction()
	{
		return action;
	}
	public Button setAction(String action)
	{
		this.action = action;
		return this;
	}
	public Rectangle getBoundingBox()
	{
		return boundingBox;
	}
	public Button setBoundingBox(Rectangle boundingBox)
	{
		this.boundingBox = boundingBox;
		return this;
	}
	public String getText()
	{
		return text;
	}
	public Button setText(String text)
	{
		this.text = text;
		return this;
	}
	
	
	
	
}
