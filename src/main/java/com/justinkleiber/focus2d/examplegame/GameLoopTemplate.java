package com.justinkleiber.focus2d.examplegame;

/**
 * Created by jklei on 8/3/2016.
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