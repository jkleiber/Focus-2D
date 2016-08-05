package com.justinkleiber.motor.controllers;

import com.justinkleiber.motor.base.Position;
import com.justinkleiber.motor.base.SpriteSheet;
import com.justinkleiber.motor.base.Graphics.ImageFormat;

import android.graphics.Bitmap;

/**
 * Contains the properties of a Sprite Sheet 
 * @author Justin
 *
 */
public class FocusSpriteSheet implements SpriteSheet {

	Bitmap bitmap;
	int rows, cols;
	ImageFormat format;
	Position p;
	
	/**
	 * Initializes a SpriteSheet
	 * @param b The Bitmap that the SpriiteSheet represents
	 * @param rows Amount of rows in the SpriteSheet
	 * @param cols Amount of Columns in the SpriteSheet
	 * @param format The format of the Bitmap
	 */
	FocusSpriteSheet(Bitmap b, int rows, int cols, ImageFormat format)
	{
		this.bitmap=b;
		this.rows = rows;
		this.cols = cols;
		this.format=format;
		this.p = new Position(0,0);
	}

	@Override
	public int getRows() {
		// TODO Auto-generated method stub
		return rows;
	}

	@Override
	public int getCols() {
		// TODO Auto-generated method stub
		return cols;
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		bitmap.recycle();
	}

	@Override
	public int getSheetWidth() {
		// TODO Auto-generated method stub
		return bitmap.getWidth();
	}

	@Override
	public int getSheetHeight() {
		// TODO Auto-generated method stub
		return bitmap.getHeight();
	}

	@Override
	public Bitmap getBitmap() {
		// TODO Auto-generated method stub
		return bitmap;
	}

	@Override
	public int getSpriteHeight() {
		// TODO Auto-generated method stub
		return bitmap.getHeight()/rows;
	}

	@Override
	public int getSpriteWidth() {
		// TODO Auto-generated method stub
		return bitmap.getWidth()/cols;
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

}
