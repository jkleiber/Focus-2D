/**
 * Package for using the hardware
 */
package com.justinkleiber.motor.controllers;

import java.io.IOException;

import com.justinkleiber.motor.base.Audio;
import com.justinkleiber.motor.base.Music;
import com.justinkleiber.motor.base.SFX;

import android.app.Activity;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.media.AudioManager;
import android.media.SoundPool;

/**
 * Manages Audio
 * @author Justin
 *
 */
public class FocusAudio implements Audio{

	AssetManager assets;
	SoundPool soundPool;
	
	/**
	 * Initializes the audio loader
	 * @param act The instance of an Android Activity
	 */
	public FocusAudio(Activity act)
	{
		act.setVolumeControlStream(AudioManager.STREAM_MUSIC);
		this.assets = act.getAssets();
		this.soundPool = new SoundPool(20, AudioManager.STREAM_MUSIC, 0);
	}
	
	
	@Override
	public Music createMusic(String file) {
		// TODO Auto-generated method stub
		try{
			AssetFileDescriptor assetDescriptor = assets.openFd(file);
			return new FocusMusic(assetDescriptor);
		}catch(IOException e){
			throw new RuntimeException("Couldn't load music '" + file + "'");
		}
	}


	@Override
	public SFX createSFX(String file) {
		// TODO Auto-generated method stub
		try{
			AssetFileDescriptor assetDescriptor = assets.openFd(file);
			int soundId = soundPool.load(assetDescriptor,0);
			return new FocusSFX(soundPool, soundId);
		}catch(IOException e){
			throw new RuntimeException("Couldn't load music '" + file + "'");
		}
	}

}
