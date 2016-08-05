package com.justinkleiber.motor.examplegame;

/**
 * Interface for required rendering functions
 */
public interface GameLoopTemplate
{
	/**
	 * Function used in a game loop to run game logic
	 */
    public abstract void update();
    
    /**
     * Function used in a game loop to draw to the screen
     * @param interpolation Passed in from the renderer; Use this to make animating objects smooth
     */
    public abstract void paint(float interpolation);
}