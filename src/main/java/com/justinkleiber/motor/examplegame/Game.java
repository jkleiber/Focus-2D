package com.justinkleiber.motor.examplegame;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Color;
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
import com.justinkleiber.motor.base.Sprite;
import com.justinkleiber.motor.base.Storage;
import com.justinkleiber.motor.base.UI;
import com.justinkleiber.motor.base.Vibrate;
import com.justinkleiber.motor.controllers.FileManager;
import com.justinkleiber.motor.controllers.FocusAudio;
import com.justinkleiber.motor.controllers.FocusClock;
import com.justinkleiber.motor.controllers.FocusCollision;
import com.justinkleiber.motor.controllers.FocusGraphics;
import com.justinkleiber.motor.controllers.FocusInput;
import com.justinkleiber.motor.controllers.FocusUI;
import com.justinkleiber.motor.controllers.FocusVibrate;


public class Game extends Activity implements GameLoopTemplate
{
    //All Focus2D Related variables go here
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
        g = new FocusGraphics(getAssets(), frame);

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

        //Setup the Focus 2D user input stuff
        input = new FocusInput(this, renderer, scaleX, scaleY);

        //Setup the rest of Focus2D
        storage = new FileManager(this);
        clock = new FocusClock();
        collision = new FocusCollision();
        vibrate = new FocusVibrate(this);
        audio = new FocusAudio(this);
        ui = new FocusUI();

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
        //Add drawing methods from FocusGraphics here
    }
}
