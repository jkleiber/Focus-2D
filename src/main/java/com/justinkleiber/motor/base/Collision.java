package com.justinkleiber.motor.base;

/**
 * Interface for detecting Collisions
 * @author Justin
 *
 */
public interface Collision {

    /**
     * This function is under development, Do not use it
     * @param s
     * @param t
     * @return
     */
	public boolean isCollisionExist(Sprite s, Sprite t);
	
	/**
     * This function is under development, Do not use it
     * @param s
     * @param t
     * @return
     */
	public boolean isCollisionExist(SpriteSheet ss, SpriteSheet tt);
	
	/**
     * This function is under development, Do not use it
     * @param s
     * @param t
     * @return
     */
	public boolean isCollisionExist(Sprite s, SpriteSheet ss);
    

    //STATIC ROTATE
	/**
	 * Detects collisions between two Static Rotation Objects
	 * @param sx First Object's X coordinate
	 * @param sy First Object's Y coordinate
	 * @param sw First Object's width
	 * @param sh First Object's height
	 * @param tx Second Object's X coordinate
	 * @param ty Second Object's Y coordinate
	 * @param tw Second Object's width
	 * @param th Second Object's height
	 * @param onCenter Set this to true
	 * @return true if there is a collision, false if not
	 */
	public boolean isCollisionExist(int sx,int sy,int sw,int sh,int tx,int ty,int tw,int th, boolean onCenter);

   /**
    * Detects collisions for Dynamic rotation objects using rotation matrices 
    * @param sx First Object's X coordinate
	 * @param sy First Object's Y coordinate
	 * @param sw First Object's width
	 * @param sh First Object's height
	 * @param tx Second Object's X coordinate
	 * @param ty Second Object's Y coordinate
	 * @param tw Second Object's width
	 * @param th Second Object's height
    * @param angle The angle that the object is rotated
    * @return true if there is a collision, false if not
    */
	public boolean isCollisionExist(int sx,int sy,int sw,int sh,int tx,int ty,int tw,int th, float angle);
	
	/**
	 * Detects if a Sprite is in a certain Position
	 * @param s A Sprite
	 * @param p The Position to check
	 * @return true if the Sprite is in the Position specified, false if not
	 * @see Sprite
	 * @see Position
	 */
	public boolean isInPosition(Sprite s, Position p);
	
	/**
	 * Checks if a Sprite is in a certain Position given a tolerance
	 * @param s A Sprite
	 * @param p The Position to check
	 * @param tolerance The amount of tolerance in coordinate units that the Sprite may be out of position 
	 * @return true if the Sprite is in the Position specified, false if not
	 * @see Sprite
	 * @see Position
	 */
	public boolean isInPosition(Sprite s, Position p, int tolerance);
	
	/**
	 * Detects if a SpriteSheet is in a certain Position
	 * @param s A SpriteSheet
	 * @param p The Position to check
	 * @return true if the SpriteSheet is in the Position specified, false if not
	 * @see SpriteSheet
	 * @see Position
	 */
	public boolean isInPosition(SpriteSheet ss, Position p);
	
	/**
	 * Checks if a SpriteSheet is in a certain Position given a tolerance
	 * @param ss A SpriteSheet
	 * @param p The Position to check
	 * @param tolerance The amount of tolerance in coordinate units that the SpriteSheet may be out of position 
	 * @return true if the Sprite is in the Position specified, false if not
	 * @see SpriteSheet
	 * @see Position
	 */
	public boolean isInPosition(SpriteSheet ss, Position p, int tolerance);
	
}
