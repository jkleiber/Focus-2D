package com.justinkleiber.motor.examplegame;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;
import android.view.Window;
import android.view.WindowManager;

import com.justinkleiber.motor.base.Audio;
import com.justinkleiber.motor.base.Clock;
import com.justinkleiber.motor.base.Collision;
import com.justinkleiber.motor.base.Graphics;
import com.justinkleiber.motor.base.Input;
import com.justinkleiber.motor.base.Storage;
import com.justinkleiber.motor.base.UI;
import com.justinkleiber.motor.base.Vibrate;
import com.justinkleiber.motor.controllers.FileManager;
import com.justinkleiber.motor.controllers.MotorAudio;
import com.justinkleiber.motor.controllers.MotorClock;
import com.justinkleiber.motor.controllers.MotorCollision;
import com.justinkleiber.motor.controllers.MotorGraphics;
import com.justinkleiber.motor.controllers.MotorInput;
import com.justinkleiber.motor.controllers.MotorUI;
import com.justinkleiber.motor.controllers.MotorVibrate;

/**
 * Example Game Loop
 */

public class Game extends Activity implements GameLoopTemplate
{
    //All Motor Related variables go here
    Graphics g;
    Input input;
    Storage storage;
    Clock clock;
    Collision collision;
    Vibrate vibrate;
    Audio audio;
    UI ui;

    GameRenderer renderer;

    //All the enums go here
    enum GameState
    {
        MENU, PLAYING, PAUSED, FINISHED
    }

    //All the variables go here
    GameState gameState;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        //Window Settings
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //Screen Settings
        int frameBufferWidth = 2560;
        int frameBufferHeight = 1440;
        Bitmap frame = Bitmap.createBitmap(frameBufferWidth, frameBufferHeight, Bitmap.Config.RGB_565);
        g = new MotorGraphics(getAssets(), frame);

        //Setup the renderer
        renderer = new GameRenderer(this, frame);

        //Scale the game resolution to the screen resolution
        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        int width = size.x;
        int height = size.y;
        float scaleX = (float) frameBufferWidth / width;
        float scaleY = (float) frameBufferHeight / height;

        //Setup the Motor user input stuff
        input = new MotorInput(this, renderer, scaleX, scaleY);

        //Setup the rest of Motor
        storage = new FileManager(this);
        clock = new MotorClock();
        collision = new MotorCollision();
        vibrate = new MotorVibrate(this);
        audio = new MotorAudio(this);
        ui = new MotorUI();

        //Show the renderer
        setContentView(renderer);  

		//Start on the menu screen
		gameState = GameState.MENU;
    }

    //You need these functions to manage game state, and to turn on/off the renderer
    @Override
    protected void onResume()
    {
        super.onResume();
        renderer.resume();
    }
	
    @Override
    protected void onPause()
    {
        super.onPause();
        renderer.pause();
    }

    @Override
    protected void onStart()
    {
        super.onStart();
    }

    @Override
    protected void onStop()
    {
        super.onStop();
    }

	
    public void update()
    {
        //Add game logic here
    }

    public void paint(float i)
    {
        //Add drawing methods from MotorGraphics here
    }
}
