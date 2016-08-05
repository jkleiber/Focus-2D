Motor is a game engine I created to run my own games on.

Motor started out largely based on the Kilobolt Android Framework, which can be found here: http://www.kilobolt.com/create-an-android-game-from-scratch-or-port-your-existing-game.html. Over time Motor has evolved to feature a interpolating rendering engine, and to work better with Android Activities, making it very different from its beginnings. Now it is also a bit more plug-and-play, but is still under active development.

Motor ~Cool Features~

- Interpolating Rendering
- Sprite Sheet management
- Integration with Android Activities
- Dynamic Rotation Objects, with rotating hit-boxes


HOW TO INSTALL Motor

1. Download and select File>Import Module in Android Studio. Navigate to the location of Motor and select it. Rename the module "Motor2D" without quotes.

2. In your build.gradle (Module: app), make dependencies look like this:

dependencies {
    //Whatever auto-generated stuff was here before can stay
    compile project(":Motor2D")
}

3. In your Android Manifest.xml, add xmlns:tools="http://schemas.android.com/tools" to the <manifest> tag.

4. Also in your Android Manifest.xml, add tools:replace="android:icon" to your <application> tag.

5. That's it! You are now ready to use Motor in your Android Game. Check out my Github Repository 'Rocketeer' or the 'examplegame' package that comes with Motor, so that you can setup your game.
