package com.justinkleiber.motor.controllers;

import com.justinkleiber.motor.base.Position;
import com.justinkleiber.motor.base.Sprite;
import com.justinkleiber.motor.base.SpriteStats;
import com.justinkleiber.motor.base.Graphics.ImageFormat;

import android.graphics.Bitmap;

/**
 * The Sprite Object, an Image and all of its properties
 * @author Justin
 *
 */
public class MotorSprite implements Sprite {

	Bitmap bitmap;
	ImageFormat format;
	Position p;
	SpriteStats ss;
	
	/**
	 * Initializes a Sprite
	 * @param b The Bitmap that the Sprite represents
	 * @param format The format of the Bitmap
	 */
	public MotorSprite(Bitmap b, ImageFormat format) {
		// TODO Auto-generated constructor stub
		this.bitmap=b;
		this.format=format;
		this.p = new Position(0,0);
		this.ss = new SpriteStats();
	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return bitmap.getWidth();
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return bitmap.getHeight();
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		bitmap.recycle();
	}

	@Override
	public Position getPosition() {
		// TODO Auto-generated method stub
		return p;
	}


	@Override
	public void setPosition(int x, int y) {
		// TODO Auto-generated method stub
		p.setPosition(x, y);
	}

	@Override
	public void setPosition(Position p) {
		// TODO Auto-generated method stub
		this.p = p;
	}

	@Override
	public void setSpriteStats(SpriteStats ss) {
		// TODO Auto-generated method stub
		this.ss=ss;
	}

	@Override
	public SpriteStats getSpriteStats() {
		// TODO Auto-generated method stub
		return ss;
	}


}
