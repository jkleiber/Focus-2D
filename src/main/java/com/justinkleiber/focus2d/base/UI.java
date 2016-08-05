package com.justinkleiber.focus2d.base;

import com.justinkleiber.focus2d.base.Input.TouchEvent;

/**
 * Defines the User Interface functions
 * @author Justin
 *
 */
public interface UI {

	/**
	 * Checks to see if a TouchEvent occurs within a rectangular boundary
	 * @param event The TouchEvent
	 * @param x x coord of rect
	 * @param y y coord of rect
	 * @param wid width of rect
	 * @param hi height of rect
	 * @return true if TouchEvent is inside rectangle, false if not
	 */
	public boolean inBounds(TouchEvent event, int x, int y, int wid, int hi);
	
	/**
	 * Treats a Sprite as a button and detects if a TouchEvent "pressed" that button
	 * @param event The TouchEvent
	 * @param b The Button (represented as a Sprite)
	 * @return true if pressed, false otherwise
	 */
	public boolean isButtonPress(TouchEvent event, Sprite b);
	
}
