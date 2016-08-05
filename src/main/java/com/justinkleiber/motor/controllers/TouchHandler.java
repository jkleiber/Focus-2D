package com.justinkleiber.motor.controllers;

import java.util.List;

import com.justinkleiber.motor.base.Input.TouchEvent;

import android.view.View.OnTouchListener;

/**
 * Interface that defines Touch input
 * @author Justin
 *
 */
public interface TouchHandler extends OnTouchListener{

	/**
	 * Checks to see if a Touch exists at a pointer
	 * @param pointer The pointer
	 * @return true if there is a touch, false if not
	 */
	public boolean isTouchDown(int pointer);
	
	/**
	 * Gets the X coordinate of a Touch
	 * @param pointer The touch's pointer
	 * @return the X coordinate of the Touch
	 */
	public int getTouchX(int pointer);
	
	/**
	 * Gets the Y coordinate of the Touch
	 * @param pointer The pointer of the touch
	 * @return the Y coordinate of the touch
	 */
	public int getTouchY(int pointer);
	
	/**
	 * Gets a list of TouchEvents
	 * @return a list of TouchEvents
	 */
	public List<TouchEvent> getTouchEvents();
}
