package com.fightthetoast.superstore;

import com.fightthetoast.superstore.product.Product;

public class Isle {

	private boolean hasIsleSign = false, requiresCleanup = false, frontSide = true;
	private Product[] products = new Product[102];
	private String catagory = "Uncatagorized";
	
	
	public Isle()
	{
		
	}
	
	public Isle(boolean hasIsleSign, boolean frontSide, String catagory)
	{
		this.hasIsleSign = hasIsleSign;
		this.frontSide = frontSide;
		this.catagory = catagory;
	}
	
	public String getCatagory() {
		return catagory;
	}
	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}
	public boolean hasIsleSign() {
		return hasIsleSign;
	}
	public void setHasIsleSign(boolean hasIsleSign) {
		this.hasIsleSign = hasIsleSign;
	}
	public boolean requiresCleanup() {
		return requiresCleanup;
	}
	public void setRequiresCleanup(boolean requiresCleanup) {
		this.requiresCleanup = requiresCleanup;
	}
	public boolean isFrontSide() {
		return frontSide;
	}
	public void setFrontSide(boolean frontSide) {
		this.frontSide = frontSide;
	}
	
}
