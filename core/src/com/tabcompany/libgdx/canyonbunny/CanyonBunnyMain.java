package com.tabcompany.libgdx.canyonbunny;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.Application;
import com.badlogic.gdx.Gdx;
import com.tabcompany.libgdx.canyonbunny.game.Assets;
import com.tabcompany.libgdx.canyonbunny.screens.DirectedGame;
import com.tabcompany.libgdx.canyonbunny.screens.MenuScreen;

public class CanyonBunnyMain extends DirectedGame {

    @Override
    public void create() {
        // Set Libgdx log level
        Gdx.app.setLogLevel(Application.LOG_DEBUG);
        // Load assets
        Assets.instance.init(new AssetManager());
        // Start game at menu screen
        setScreen(new MenuScreen(this));
    }
}
