package com.justinkleiber.motor.base;

/**
 * Sets up the Vibrate functions
 * @author Justin
 *
 */
public interface Vibrate {

	/**
	 * Vibrates the phone for a specified period of time
	 * @param ms The amount of time to Vibrate in ms
	 */
	public void vibrate(long ms);
	
	/**
	 * Vibrates the phone as a pattern from an array of times
	 * Every even element is time on, odd elements are time off
	 * @param ms Array of time pattern in ms.
	 */
	public void vibratePattern(long[] ms);
}
