package com.justinkleiber.focus2d.base;

import android.graphics.Paint;

/**
 * Provides an interface for drawing Graphics to the screen
 * @author Justin
 *
 */
public interface Graphics {

	
	/**
	 * Enum that lists the 3 possible ImageFormats
	 * @author Justin
	 *
	 */
	public static enum ImageFormat{
		ARGB8888, ARGB4444, RGB565
	}
	
	/**
	 * Draws a String to the screen
	 * @param txt The text to draw
	 * @param x The x coordinate to draw the text at
	 * @param y The y coordinate to draw the text at
	 * @param p A Paint object that modifies the text appearance
	 */
	void drawString(String txt, int x, int y, Paint p);
	
	/**
	 * Clears the screen and displays one color
	 * @param color the Color to display
	 */
	public void clearScreen(int color);
	
	/**
	 * Draws a Line on the screen from a start point to an endpoint
	 * @param x Starting x coordinate
	 * @param y Starting y coordinate
	 * @param x2 Ending x coordinate
	 * @param y2 Ending y coordinate
	 * @param color Color of the line
	 */
	public void drawLine(int x, int y, int x2, int y2, int color);
	
	/**
	 * Draws a rectangle (not filled in)
	 * @param x X coordinate of top-left corner
	 * @param y Y coordinate of top-left corner
	 * @param width Width of the rectangle
	 * @param height Height of the Rectangle
	 * @param color Color of the Rectangle's lines
	 */
	public void drawRect(int x, int y, int width, int height, int color);
	
	/**
	 * Gets the width of the Graphics frame
	 * @return The width of the drawing surface
	 */
	public int getWidth();
	
	/**
	 * Gets the height of the Graphics frame
	 * @return The height of the drawing surface
	 */
	public int getHeight();
	
	/**
	 * Color the entire screen using ARGB color sequence
	 * @param a The opacity
	 * @param r The Red value
	 * @param g The Green value
	 * @param b The Blue value
	 */
	public void drawARGB(int a, int r, int g, int b);
	
	/**
	 * Load an image file and create a new Sprite
	 * @param file location of the image to be used as a Sprite
	 * @return A new Sprite
	 * @see Sprite
	 */
	public Sprite newSprite(String file);

    //BACKDROP IS UNTESTED
	/**
	 * Load an image and make it a Backdrop
	 * @param file Location of image file to be used
	 * @return A new Backdrop
	 * @see Backdrop
	 */
	public Backdrop newBackdrop(String file);
	/**
	 * Draws a Backdrop
	 * @param b The Backdrop to draw
	 * @see Backdrop
	 */
    public void drawBackdrop(Backdrop b);

    /**
     * Loads and creates a new SpriteSheet
     * @param file The image to be used as a SpriteSheet
     * @param rows The amount of rows in the SpriteSheet
     * @param cols The amount of Columns in the SpriteSheet
     * @return A new SpriteSheet
     */
    public SpriteSheet newSpriteSheet(String file, int rows, int cols);

    /*
    * STATIC ROTATION OBJECTS
    * These objects do not rotate, their 'draw points' are at the top left
    * DO NOT use DYNAMIC ROTATE FUNCTIONS with these or unexpected results will occur
    * Example: The DYNAMIC ROTATE Collision function will not work with these
     */
    
    /**
     * Draws a Static Rotation Sprite, a Sprite whose origin point is at the top left corner
     * @param s The Sprite to draw
     * @param x The x coordinate
     * @param y The y coordinate
     * @see Sprite
     */
	public void drawSprite(Sprite s, int x, int y);
	/**
	 * Draws a Static Rotation Sprite, a Sprite whose origin point is at the top left corner
	 * @param s The Sprite to draw
	 * @param p The Point where the Sprite's top-left corner should be
	 * @see Position
	 * @see Sprite
	 */
    public void drawSprite(Sprite s, Position p);
    
    /**
     * Draws a Static Rotation Sprite, a Sprite whose origin point is at the top left corner.
     * This function expects the Sprite to have its position defined already
     * @param s The Sprite to draw
     * @see Sprite
     */
    public void drawSprite(Sprite s);

    /**
     * Draws a Static Rotation SpriteSheet, whose origin point is in the top left of the Sprite being drawn
     * @param ss The SpriteSheet to reference
     * @param x X coordinate
     * @param y Y coordinate
     * @param row The index of the row that the Sprite being used is on
     * @param col The index of the column that the Sprite being used is on
     * @see SpriteSheet
     */
    public void drawSpriteSheet(SpriteSheet ss, int x, int y, int row, int col);
    /**
     * Draws a Static Rotation SpriteSheet, whose origin point is in the top left of the Sprite being drawn
     * This function assumes that the position is defined
     * @param ssThe SpriteSheet to reference
     * @param row The index of the row that the Sprite being used is on
     * @param col The index of the column that the Sprite being used is on
     * @see SpriteSheet
     */
    public void drawSpriteSheet(SpriteSheet ss, int row, int col);

    /**
     * Animates a Static Rotation SpriteSheet column
     * @param ss The SpriteSheet to have animated
     * @param x The X coordinate
     * @param y The Y coordinate
     * @param col The column to animate
     * @see SpriteSheet
     */
    public void animateSheetColumn(SpriteSheet ss, int x, int y, int col);
    /**
     * Animates a Static Rotation SpriteSheet column with a delay
     * The delay feature may have unexpected results because it is not integrated with the draw functions
     * @param ss The SpriteSheet to have animated
     * @param x The X coordinate
     * @param y The Y coordinate
     * @param col The column to animate
     * @param delay The amount of loops to wait between frames
     * @see SpriteSheet
     */
    public void animateSheetColumn(SpriteSheet ss, int x, int y, int col, int delay);
    /**
     * Animates a Static Rotation SpriteSheet row with a delay
     * The delay feature may have unexpected results because it is not integrated with the draw functions
     * @param ss The SpriteSheet to have animated
     * @param x The X coordinate
     * @param y The Y coordinate
     * @param row The row to animate
     * @param delay The amount of loops to wait between frames
     * @see SpriteSheet
     */
    public void animateSheetRow(SpriteSheet ss, int x, int y, int row, int delay);
    /**
     * Animates a Static Rotation SpriteSheet row with a delay, assuming Position is defined
     * @param ss The SpriteSheet to animate
     * @param row The row to animate
     * @param delay The amount of loops to wait between frames
     * @see SpriteSheet
     */
    public void animateSheetRow(SpriteSheet ss, int row, int delay);
    /**
     * Animates a Static Rotation SpriteSheet row
     * @param ss The SpriteSheet
     * @param x The X coordinate
     * @param y The Y coordinate
     * @param row The row to animate
     * @see SpriteSheet
     */
    public void animateSheetRow(SpriteSheet ss, int x, int y, int row);

    /**
     * Animates a Sprite to a position on the screen
     * @param s The Sprite
     * @param p The position the Sprite should go
     * @param pace How quickly the Sprite should go there (Proportional Control)
     */
    public void animateSpriteToPosition(Sprite s, Position p, int pace);
    /**
     * Animates a SpriteSheet Sprite to a position on the screen
     * @param s The SpriteSheet
     * @param row The row of the Sprite
     * @param col The column of the Sprite
     * @param p The position the Sprite should go
     * @param pace How quickly the Sprite should go there (Proportional Control)
     */
    public void animateSpriteSheetToPosition(SpriteSheet s, int row, int col, Position p, float pace);



    /*
    * DYNAMIC ROTATION OBJECTS
    * These objects rotate, their 'draw points' are at the center
    * DO NOT use STATIC ROTATE FUNCTIONS with these or unexpected results will occur
    * Example: The STATIC ROTATE Collision function will pick up extra collisions if these are rotated
     */
    /**
     * Draw a Dynamic Rotation Sprite (origin point is at the center for best rotation results)
     * @param s Sprite to draw
     * @param p Position to draw the Sprite
     * @param angle Angle to rotate the Sprite
     */
	public void drawSprite(Sprite s, Position p, float angle);
	/**
	 * Draw a Dynamic Rotation Sprite (origin point is at the center for best rotation results), assuming Position is defined in the Sprite
	 * @param s Sprite to draw
	 * @param angle Angle to rotate the Sprite
	 */
	public void drawSprite(Sprite s, float angle);
	
	/**
	 * Draw a Dynamic Rotation Sprite (origin point is at the center for best rotation results)
	 * @param s Sprite to draw
	 * @param x X coordinate
	 * @param y Y coordinate
	 * @param angle Angle to rotate the Sprite
	 */
    public void drawSprite(Sprite s, int x, int y, float angle);

    /**
     * Animate a Dynamic Rotation SpriteSheet Row (origin point is at the center of Sprite for best rotation results) with a delay
     * This assumes Position is already defined
     * @param ss SpriteSheet to animate
     * @param row Row to animate
     * @param delay amount of loops to wait before progressing to next frame
     * @param angle Angle of rotation
     */
    public void animateSheetRow(SpriteSheet ss, int row, int delay, float angle);
    /**
     * Animate a Dynamic Rotation SpriteSheet Row (origin point is at the center of Sprite for best rotation results) with a delay
     * @param ss SpriteSheet to animate
     * @param x X coordinate
     * @param y Y coordinate
     * @param row Row to animate
     * @param delay amount of loops to wait before progressing to next frame
     * @param angle Angle of rotation
     */
    public void animateSheetRow(SpriteSheet ss, float x, float y, int row, int delay, float angle);
    
    /**
     * Another way to animate a SpriteSheet row with a delay
     * @param ss SpriteSheet
     * @param x X coordinate
     * @param y Y coordinate
     * @param row Row to animate
     * @param delay the amount of frames to wait
     * @param delayIndex the index to store the certain delay amount in
     * @param angle Rotation angle
     */
    public void animateSheetRow(SpriteSheet ss, float x, float y, int row, int delay, int delayIndex, float angle);
    
    /**
     * Animates a SpriteSheet from one index to another without regard for rows or columns.
     * Index 0 is the top left of the SpriteSheet and increments to the right. New lines do not affect index
     * @param ss SpriteSheet
     * @param start The index to start at
     * @param end The index to end at
     * @param delay The amount of loops to wait between frames
     * @param shouldStart Restarts the sequence if true
     * @param angle Angle of Rotation
     */
    public void animateSheetByIndex(SpriteSheet ss, int start, int end, int delay, boolean shouldStart, float angle);

    /**
     * Animates a Dynamic Rotation SpriteSheet to a point
     * @param s SpriteSheet
     * @param row the row of the Sprite
     * @param col The column of the Sprite
     * @param cx The current X coord
     * @param cy The current Y coord
     * @param x The desired x coord
     * @param y The desired y coord
     * @param pace The speed (Proportional Control)
     * @param angle Rotation angle
     */
    public void animateSpriteSheetToCoordinates(SpriteSheet s, int row, int col, int cx, int cy, int x, int y, float pace, float angle);
    
    /**
     * Lets the user animate an X coordinate in the draw functions 
     * @param cx Current x coord
     * @param x Desired x coord
     * @param pace The speed (Proportional Control)
     * @return The new X coordinate
     */
    public float animatedXSpeed(int cx, int x, float pace);
    /**
     * Lets the user animate a Y coordinate in the draw functions 
     * @param cy Current y coord
     * @param y Desired y coord
     * @param pace The speed (Proportional Control)
     * @return The new Y coordinate
     */
    public float animatedYSpeed(int cy,int y, float pace);

    /**
     * Draws the Dynamic Rotation hitbox around an object
     * @param x x coord
     * @param y y coord
     * @param w width
     * @param h height
     * @param tx Not used anymore 
     * @param ty Not used anymore
     * @param tw Not used anymore
     * @param th Not used anymore
     * @param angle rotation angle
     * @param paint Color and style of line
     */
    public void drawHitBox(int x,int y,int w,int h,int tx,int ty,int tw,int th,float angle, Paint paint);

}
