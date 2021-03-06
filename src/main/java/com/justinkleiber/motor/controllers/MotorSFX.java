package com.justinkleiber.motor.controllers;

import com.justinkleiber.motor.base.SFX;

import android.media.SoundPool;

/**
 * Handles and plays the Sound Effects
 * @author Justin
 *
 */
public class MotorSFX implements SFX {

	int soundId;
	SoundPool soundPool;
	
	/**
	 * Initializes the Sound Effects controller
	 * @param sp The SoundPool
	 * @param id The Sound ID
	 */
	public MotorSFX(SoundPool sp, int id)
	{
		this.soundId=id;
		this.soundPool=sp;
	}
	@Override
	public void play(float volume) {
		// TODO Auto-generated method stub
		soundPool.play(soundId, volume, volume, 0, 0, 1);
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		soundPool.unload(soundId);
	}

}
