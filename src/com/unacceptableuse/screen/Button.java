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
	public void setBackgroundImage(Image backgroundImage)
	{
		this.backgroundImage = backgroundImage;
	}
	public String getAction()
	{
		return action;
	}
	public void setAction(String action)
	{
		this.action = action;
	}
	public Rectangle getBoundingBox()
	{
		return boundingBox;
	}
	public void setBoundingBox(Rectangle boundingBox)
	{
		this.boundingBox = boundingBox;
	}
	public String getText()
	{
		return text;
	}
	public void setText(String text)
	{
		this.text = text;
	}
	
	
	
	
}
