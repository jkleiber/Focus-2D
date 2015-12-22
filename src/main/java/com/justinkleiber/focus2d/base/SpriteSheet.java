package com.justinkleiber.focus2d.base;

import android.graphics.Bitmap;

/**
 * Defines a SpriteSheet and its functions
 * @author Justin
 *
 */
public interface SpriteSheet {

	/**
	 * Gets the width of the entire SpriteSheet
	 * @return the width of the sheet
	 */
	public int getSheetWidth();
	
	/**
	 * Gets the height of the entire SpriteSheet
	 * @return the height of the sheet
	 */
	public int getSheetHeight();
	
	/**
	 * Gets the height of each Sprite in the Sheet
	 * @return the height of a Sprite
	 */
	public int getSpriteHeight();
	
	/**
	 * Gets the width of each Sprite in the Sheet
	 * @return the width of a Sprite
	 */
	public int getSpriteWidth();
	
	/**
	 * Gets the number of rows in the SpriteSheet
	 * @return the number of rows
	 */
	public int getRows();
	
	/**
	 * Gets the number of columns in the SpriteSheet
	 * @return the number of columns
	 */
	public int getCols();
	
	/**
	 * Disposes of the SpriteSheet
	 */
	public void dispose();
	
	/**
	 * Gets the bitmap that the SpriteSheet represents
	 * @return a Bitmap, the image file of the SpriteSheet
	 */
	public Bitmap getBitmap();
	
	/**
	 * Gets the Position of the Current Sprite displayed by the SpriteSheet
	 * @return the current Position
	 * @see Position
	 */
	
	public Position getPosition();
	
	/**
	 * Sets the SpriteSheet Position using coordinates
	 * @param x x coord
	 * @param y y coord
	 */
	public void setPosition(int x, int y);
	
	/**
	 * Sets the SpriteSheet Position using a Position
	 * @param p New Position
	 */
	public void setPosition(Position p);
}
