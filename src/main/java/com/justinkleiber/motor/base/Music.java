package com.justinkleiber.motor.base;

/**
 * Interface for handling Music
 * @author Justin
 *
 */
public interface Music {

	/**
	 * Plays music
	 */
	public void play();
	
	/**
	 * Stops playing music
	 */
	public void stop();
	
	/**
	 * Pauses playing music
	 */
	public void pause();
	
	/**
	 * Sets whether the music looping
	 * @param loop if true, loop the music, otherwise do not loop
	 */
	public void setLoop(boolean loop);
	
	/**
	 * Sets volume of sound
	 * @param volume The volume from 0 to 1
	 */
	public void setVolume(float volume);
	
	/**
	 * Detects if music is playing
	 * @return true if music is playing, false if not
	 */
	public boolean isPlaying();
	
	/**
	 * Determines if the music is stopped
	 * @return true if stopped, false if not
	 */
	public boolean isStopped();
	
	/**
	 * Determines if the music is looping
	 * @return true if it is looping, false if not
	 */
	public boolean isLooping();
	
	/**
	 * Disposes of the music
	 */
	public void dispose();
	
	/**
	 * Starts the music over from the beginning
	 */
	public void restart();
}
