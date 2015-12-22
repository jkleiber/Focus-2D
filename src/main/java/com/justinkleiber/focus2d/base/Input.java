package com.justinkleiber.focus2d.base;

import java.util.List;

/**
 * Interface for handling Input
 * @author Justin
 *
 */
public interface Input {

	/**
	 * Enum that holds the codes for different TouchEvent types
	 * @author Justin
	 *
	 */
	public static class TouchEvent{
		public static final int TOUCH_DOWN=0;
		public static final int TOUCH_UP=1;
		public static final int TOUCH_DRAGGED=2;
		public static final int TOUCH_HOLD=3;
		
		public int type;
		public int x,y;
		public int pointer;
	}
	
	/**
	 * Checks to see if there is a touch
	 * @param pointer The User pointer
	 * @return true if there is a touch, false if not
	 */
	public boolean isTouchDown(int pointer);
	
	/**
	 * Get the X coordinate of touch
	 * @param pointer The User pointer
	 * @return the x coordinate of a TouchEvent
	 */
	public int getTouchX(int pointer);
	
	/**
	 * Gets the Y coordinate of a touch
	 * @param pointer The user pointer
	 * @return the Y coordinate of a touch
	 */
	public int getTouchY(int pointer);
	
	/**
	 * Gets a list of all touch events
	 * @return A list of TouchEvents
	 */
	public List<TouchEvent> getTouchEvents();
}
