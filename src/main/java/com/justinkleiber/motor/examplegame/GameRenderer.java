/**
 * Package to show how rendering is done, and how to set up a game
 */
package com.justinkleiber.motor.examplegame;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import java.util.concurrent.TimeUnit;

/**
 * This is an example of the interpolating rendering system that comes with focus2D
 * 
 * The Game class represents the class where the game is actually run
 */
public class GameRenderer extends SurfaceView implements Runnable
{
	
	Game game;
	Bitmap frame;
	Thread renderThread=null;
	SurfaceHolder holder;
	volatile boolean running=false;

	long startTime;

	int TICKS_PER_SECOND = 25;
    int SKIP_TICKS = 1000 / TICKS_PER_SECOND;
    int MAX_FRAMESKIP = 5;
    int loops;
    float interpolation;
    int next_game_tick;
    
    /**
     * Initializes the main renderer
     * @param g A Game Class, in this case, GameLoop
     * @param frame The Bitmap that you use as a surface for drawing. This should be the same one you use when using the Graphics Class
     * @see Graphics
     * @see FocusGraphics
     */
	public GameRenderer(GameLoop g, Bitmap frame)
	{
		super(g);
		this.game = g;
		this.frame = frame;
		this.holder = getHolder();
	}
	
	/**
	 * The loop where all rendering is done
	 * Calculations are done in the update() method
	 * Drawing to the screen is done in the paint(interpolation) method. The interpolation variable must be used insiide that method to make rendering smooth and consistent across devices
	 */
	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		Rect dstRect = new Rect();
		startTime = System.nanoTime();
		next_game_tick = 0;

		while(running)
		{

			if(!holder.getSurface().isValid())
			{
				continue;
			}

			//time in ms since game start
			float deltaTime = TimeUnit.MILLISECONDS.convert(System.nanoTime()-startTime, TimeUnit.NANOSECONDS);

			loops = 0;

	        while( deltaTime > next_game_tick && loops < MAX_FRAMESKIP) 
			{
	        	gameLoop.update();
	            next_game_tick += SKIP_TICKS;
	            loops++;
	        }

	        interpolation = ((float) deltaTime + SKIP_TICKS - next_game_tick)/ (float) SKIP_TICKS;

			gameLoop.paint(interpolation);
	        Canvas canvas = holder.lockCanvas();
			canvas.getClipBounds(dstRect);
			canvas.drawBitmap(frame, null, dstRect, null);
			holder.unlockCanvasAndPost(canvas);
		}
	}

	/**
	 * Called when the game is paused, usually in onPause()
	 */
	public void pause()
	{
		running = false;
		while(true)
		{
			try
			{
				renderThread.join();
				break;
			}
			catch(InterruptedException e)
			{
				//retry
			}
		}
	}
	
	/**
	 * Called to resume the game, usually in onResume()
	 */
	public void resume() 
	{
		running=true;
		renderThread=new Thread(this);
		renderThread.start();
	}

}
