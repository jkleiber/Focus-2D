package com.justinkleiber.focus2d.base;

import android.graphics.Paint;

public interface Graphics {

	public static enum ImageFormat{
		ARGB8888, ARGB4444, RGB565
	}
	
	void drawString(String txt, int x, int y, Paint p);
	
	public void clearScreen(int color);
	
	public void drawLine(int x, int y, int x2, int y2, int color);
	
	public void drawRect(int x, int y, int width, int height, int color);
	
	public int getWidth();
	
	public int getHeight();
	
	public void drawARGB(int a, int r, int g, int b);
	
	public Sprite newSprite(String file);
	
	public Backdrop newBackdrop(String file);
	
	public void drawSprite(Sprite s, int x, int y);
	
	public void drawSprite(Sprite s, int x, int y, float angle);
	
	public void drawSprite(Sprite s, Position p);
	
	public void drawSprite(Sprite s, Position p, float angle);
	
	public void drawSprite(Sprite s, float angle);
	
	public void drawSprite(Sprite s);
	
	public void drawBackdrop(Backdrop b);
	
	public SpriteSheet newSpriteSheet(String file, int rows, int cols);
	
	public void drawSpriteSheet(SpriteSheet ss, int x, int y, int row, int col);
	
	public void drawSpriteSheet(SpriteSheet ss, int row, int col);
	
	public void animateSheetRow(SpriteSheet ss, int x, int y, int row);
	
	public void animateSheetColumn(SpriteSheet ss, int x, int y, int col);
	
	public void animateSheetRow(SpriteSheet ss, int x, int y, int row, int delay);
	
	public void animateSheetRow(SpriteSheet ss, int row, int delay);
	
	public void animateSheetRow(SpriteSheet ss, int row, int delay, float angle);
	
	public void animateSheetColumn(SpriteSheet ss, int x, int y, int col, int delay);
	
	public void animateSpriteToPosition(Sprite s, Position p, int pace);
	
	public void animateSpriteSheetToPosition(SpriteSheet s, int row, int col, Position p, float pace);

	public void animateSheetByIndex(SpriteSheet ss, int start, int end, int delay, boolean shouldStart);
}
