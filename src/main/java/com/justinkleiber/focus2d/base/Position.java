package com.justinkleiber.focus2d.base;

/**
 * Class that defines an Object's position using coordinates
 * @author Justin
 *
 */
public class Position {

	public int x;
	public int y;
	
	/**
	 * Creates a new Position 
	 * @param _x x coord
	 * @param _y y coord
	 */
	public Position(int _x, int _y)
	{
		this.x = _x;
		this.y = _y;
	}
	
	/**
	 * Gets the current Position object
	 * @return this Position
	 */
	public Position getPosition()
	{
		return this;
	}
	
	/**
	 * Sets a Position based on coordinates
	 * @param _x x coord
	 * @param _y y coord
	 */
	public void setPosition(int _x, int _y)
	{
		this.x = _x;
		this.y = _y;
	}
	
	/**
	 * Uses a Position to set a Position
	 * @param _p A Position
	 */
	public void setPosition(Position _p)
	{
		this.x = _p.x;
		this.y = _p.y;
	}
}
