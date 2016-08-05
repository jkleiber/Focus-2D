package com.justinkleiber.motor.base;

/**
 * Interface for Sound Effects
 * @author Justin
 *
 */
public interface SFX {

	/**
	 * Plays Sound Effect
	 * @param volume The volume (0-1) to play the SFX at
	 */
	public void play(float volume);
	
	/**
	 * disposes of the SFX
	 */
	public void dispose();
}
