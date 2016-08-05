package com.justinkleiber.motor.base;

/**
 * Defines the Sprite Object and its functions
 * @author Justin
 *
 */
public interface Sprite {

	/**
	 * Gets a Sprite width
	 * @return the width of the Sprite
	 */
	public int getWidth();
	
	/**
	 * Gets a Sprite height
	 * @return the height of the Sprite
	 */
	public int getHeight();
	
	/**
	 * Gets a Sprite Position
	 * @return the Position of the Sprite
	 */
	public Position getPosition();
	
	/**
	 * Sets the Position of the Sprite using coordinates
	 * @param x x coord
	 * @param y y coord
	 */
	public void setPosition(int x, int y);
	
	/**
	 * Sets Sprite Position using another Position
	 * @param p The Position
	 */
	public void setPosition(Position p);
	
	/**
	 * Dispose of the Sprite Object
	 */
	public void dispose();
	
	/**
	 * Sets statistics for the Sprite
	 * @param ss SpriteStats
	 */
	public void setSpriteStats(SpriteStats ss);
	
	/**
	 * Gets the Sprite's Statistics
	 * @return a reference to the SpriteStats of the Sprite
	 */
	public SpriteStats getSpriteStats();
	
}
