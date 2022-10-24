<<<<<<<< HEAD:android/app/src/main/java/com/furcoder/wilddream/MainActivity.java
package com.furcoder.wilddream;
========
package com.utopia.pxviewr;
>>>>>>>> upstream/master:android/app/src/main/java/com/utopia/pxviewr/MainActivity.java

import android.os.Bundle;
import com.facebook.react.ReactActivity;
import com.facebook.react.ReactActivityDelegate;
import com.facebook.react.ReactRootView;
import com.swmansion.gesturehandler.react.RNGestureHandlerEnabledRootView;
import org.devio.rn.splashscreen.SplashScreen; 

public class MainActivity extends ReactActivity {

    /**
     * Returns the name of the main component registered from JavaScript.
     * This is used to schedule rendering of the component.
     */
    @Override
    protected String getMainComponentName() {
<<<<<<<< HEAD:android/app/src/main/java/com/furcoder/wilddream/MainActivity.java
        return "WildDream";
========
        return "PxViewR";
>>>>>>>> upstream/master:android/app/src/main/java/com/utopia/pxviewr/MainActivity.java
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // workaround for crashing on killed app restore 
        // https://github.com/kmagiera/react-native-screens/issues/17#issuecomment-424704067
        // https://github.com/kmagiera/react-native-screens/issues/114
        super.onCreate(null);
        // super.onCreate(savedInstanceState);
        SplashScreen.show(this);
    }

    @Override
    protected ReactActivityDelegate createReactActivityDelegate() {
        return new ReactActivityDelegate(this, getMainComponentName()) {
            @Override
            protected ReactRootView createRootView() {
                return new RNGestureHandlerEnabledRootView(MainActivity.this);
            }
        };
    }
}
