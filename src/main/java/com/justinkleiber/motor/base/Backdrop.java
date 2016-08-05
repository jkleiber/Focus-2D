package com.justinkleiber.motor.base;

/**
 * An interface for the FocusBackdrop class
 * @author Justin
 *
 */
public interface Backdrop {

	/**
	 * Returns the width of the Backdrop
	 * @return The width of the Backdrop
	 */
	public int getWidth();
	
	/**
	 * Returns the height of the Backdrop
	 * @return The height of the Backdrop
	 */
	public int getHeight();
	
	/**
	 * Disposes of the current Backdrop
	 */
	public void dispose();
	
}
