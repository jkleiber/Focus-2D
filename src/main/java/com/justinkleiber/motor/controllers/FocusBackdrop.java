package com.justinkleiber.motor.controllers;

import com.justinkleiber.motor.base.Backdrop;
import com.justinkleiber.motor.base.Graphics.ImageFormat;

import android.graphics.Bitmap;

/**
 * Implements the defined Backdrop Functions
 * @author Justin
 *
 */
public class FocusBackdrop implements Backdrop{

	Bitmap bitmap;
	ImageFormat format;
	
	/**
	 * Creates an object that acts as a background
	 * @param b The bitmap to act as the background
	 * @param format The format of the bitmap.
	 */
	FocusBackdrop(Bitmap b, ImageFormat format)
	{
		this.bitmap=b;
		this.format=format;
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

}
