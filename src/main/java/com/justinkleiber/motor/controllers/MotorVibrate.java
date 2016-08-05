package com.justinkleiber.motor.controllers;

import com.justinkleiber.motor.base.Vibrate;

import android.content.Context;
import android.os.Vibrator;

/**
 * Controls Phone vibration
 * @author Justin
 *
 */
public class MotorVibrate implements Vibrate{

	Vibrator v;
	Context context;
	
	/**
	 * Initializes the Vibration Control
	 * @param c The application Context
	 */
	public MotorVibrate(Context c)
	{
		this.context = c;
		v = (Vibrator) c.getSystemService(Context.VIBRATOR_SERVICE);
	}
	@Override
	public void vibrate(long ms) {
		// TODO Auto-generated method stub
		v.vibrate(ms);
	}

	@Override
	public void vibratePattern(long[] ms) {
		// TODO Auto-generated method stub
		v.vibrate(ms, 0);
	}

}
