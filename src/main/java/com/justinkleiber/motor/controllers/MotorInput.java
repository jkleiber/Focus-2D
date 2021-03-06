package com.justinkleiber.motor.controllers;

import java.util.List;

import com.justinkleiber.motor.base.Input;

import android.content.Context;
import android.view.View;

/**
 * Manages both the Multi-Touch and Single Touch features of Motor
 * @author Justin
 *
 */
public class MotorInput implements Input {

	TouchHandler touchHandler;
	/**
	 * Initializes the Touch Input Class
	 * @param c The application Context
	 * @param v The View
	 * @param scaleX The screen X scaling factor
	 * @param scaleY The screen Y scaling factor
	 */
	public MotorInput(Context c, View v,
					  float scaleX, float scaleY) {
		// TODO Auto-generated constructor stub
		if(android.os.Build.VERSION.SDK_INT<5)
		{
			touchHandler = new MotorOneTouch(v,scaleX,scaleY);
		}
		else
		{
			touchHandler = new MotorMultiTouch(v,scaleX,scaleY);
		}
	}

	@Override
	public boolean isTouchDown(int pointer) {
		// TODO Auto-generated method stub
		return touchHandler.isTouchDown(pointer);
	}

	@Override
	public int getTouchX(int pointer) {
		// TODO Auto-generated method stub
		return touchHandler.getTouchX(pointer);
	}

	@Override
	public int getTouchY(int pointer) {
		// TODO Auto-generated method stub
		return touchHandler.getTouchY(pointer);
	}

	@Override
	public List<TouchEvent> getTouchEvents() {
		// TODO Auto-generated method stub
		return touchHandler.getTouchEvents();
	}

}
