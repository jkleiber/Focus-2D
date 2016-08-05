/**
 * Package for interfacing with hardware
 */
package com.justinkleiber.motor.base;

/**
 * Provides an interface for creating Audio
 * @author Justin
 *
 */
public interface Audio {
	
	/**
	 * Loads a music file from assets to play later
	 * @param file The location of the music file
	 * @return Music object that can be used to play music
	 * @see Music
	 */
	public Music createMusic(String file);
	/**
	 * Loads a sound effect file from assets to play later
	 * @param file The location of the music file
	 * @return SFX object that can be used to play music
	 * @see SFX
	 */
	public SFX createSFX(String file);
}
