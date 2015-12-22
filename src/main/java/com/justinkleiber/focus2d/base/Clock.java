package com.justinkleiber.focus2d.base;

/**
 * Interface for keeping time
 * @author Justin
 *
 */
public interface Clock {

	/**
	 * Resets the clock to 0
	 */
	public void resetClock();
	
	/**
	 * Starts the clock
	 */
	public void startClock();
	
	/**
	 * Returns how many seconds have elapsed since the last Reset/Start
	 * @return Seconds Elapsed
	 */
	public long secondsElapsed();

	/**
	 * Pauses the clock
	 */
	public void pauseClock();
	/**
	 * Resumes the clock after pause
	 */
	public void resumeClock();
	
	
}
