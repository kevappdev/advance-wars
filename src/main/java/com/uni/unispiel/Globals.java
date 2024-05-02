package com.uni.unispiel;

import com.uni.unispiel.Levels.Level;
import com.uni.unispiel.Levels.LittleIsland;

public class Globals {

    public static final String GAME_TITLE = "Unispiel";
    public static final int WINDOW_SIZE = 800;
    public static final int SCENE_SIZE = WINDOW_SIZE;

    public static Level[] LEVELS = {
            new LittleIsland()
    };

}
