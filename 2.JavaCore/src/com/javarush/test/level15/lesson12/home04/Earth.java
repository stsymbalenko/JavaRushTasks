package com.javarush.test.level15.lesson12.home04;

/**
 * Created by s.tsymbalenko on 30.09.2016.
 */
public final class Earth implements Planet {
    private static Earth _instance = null;

    Earth() {}

    public static synchronized Earth getInstance() {
        if (_instance == null)
            _instance = new Earth();
        return _instance;
    }
}
