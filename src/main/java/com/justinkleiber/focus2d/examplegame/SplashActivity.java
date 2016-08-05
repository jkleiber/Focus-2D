package com.justinkleiber.focus2d.examplegame;

import com.justinkleiber.focus2d.base.Graphics;

/**
 * Example of using a Splash Screen while loading all the resources the game needs
 * @author Justin
 *
 */
public class SplashActivity extends Activity
{
	Graphics g;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(SPLASH_SCREEN_LAYOUT);

        int frameBufferWidth = 2560;
        int frameBufferHeight = 1440;
        Bitmap frame = Bitmap.createBitmap(frameBufferWidth, frameBufferHeight, Bitmap.Config.RGB_565);
        
        g = new FocusGraphics(getAssets(), frame);

        //Load all assets before running the thread
        Assets.sprite = g.newSprite("sprite.png");

        Thread splash = new Thread()
        {
            public void run()
            {
                try
                {
                    sleep(2000);
                    Intent game = new Intent("android.intent.action.GAME");//You can replace this with whatever your intent is
                    startActivity(game);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                finally
                {
                    finish();
                }
            }
        };
        splash.start();
    }
}
