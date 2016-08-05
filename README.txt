Focus 2D is a game engine I created to run my own games on.

Focus 2D started out largely based on the Kilobolt Android Framework, which can be found here: http://www.kilobolt.com/create-an-android-game-from-scratch-or-port-your-existing-game.html. Over time Focus 2D has evolved to feature a interpolating rendering engine, and to work better with Android Activities, making it very different from its beginnings. Now it is also a bit more plug-and-play, but is still under active development.

Focus2D ~Cool Features~

- Interpolating Rendering
- Sprite Sheet management
- Integration with Android Activities
- Dynamic Rotation Objects, with rotating hit-boxes


HOW TO INSTALL Focus2D

1. Download and Import this project as a New Module in you app.

2. In your build.gradle (Module: app), make dependencies look like this:

dependencies {
    //Whatever auto-generated stuff was here before can stay
    compile project(":Focus-2D")
}

3. In your Android Manifest.xml, add xmlns:tools="http://schemas.android.com/tools" to the <manifest> tag.

4. Also in your Android Manifest.xml, add tools:replace="android:icon" to your <application> tag.

5. That's it! You are now ready to use Focus2D in your Android Game. Check out my Github Repository 'Rocketeer' or the 'examplegame' package that comes with Focus2D, so that you can setup your game.