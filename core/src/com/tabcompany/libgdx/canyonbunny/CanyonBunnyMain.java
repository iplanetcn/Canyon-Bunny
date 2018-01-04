package com.tabcompany.libgdx.canyonbunny;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.Application;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Interpolation;
import com.tabcompany.libgdx.canyonbunny.game.Assets;
import com.tabcompany.libgdx.canyonbunny.screens.DirectedGame;
import com.tabcompany.libgdx.canyonbunny.screens.MenuScreen;
import com.tabcompany.libgdx.canyonbunny.screens.transitions.ScreenTransition;
import com.tabcompany.libgdx.canyonbunny.screens.transitions.ScreenTransitionSlice;

public class CanyonBunnyMain extends DirectedGame {

    @Override
    public void create() {
        // Set Libgdx log level
        Gdx.app.setLogLevel(Application.LOG_DEBUG);
        // Load assets
        Assets.instance.init(new AssetManager());
        // Start game at menu screen
        ScreenTransition transition = ScreenTransitionSlice.init(2,
                ScreenTransitionSlice.UP_DOWN, 10, Interpolation.pow5Out);
        setScreen(new MenuScreen(this), transition);
    }
}
