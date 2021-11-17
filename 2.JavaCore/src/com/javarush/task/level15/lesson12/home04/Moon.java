package com.javarush.test.level15.lesson12.home04;

/**
 * Created by s.tsymbalenko on 30.09.2016.
 */
public final class Moon implements Planet {
    private static Moon _instance = null;

    Moon() {}

    public static synchronized Moon getInstance() {
        if (_instance == null)
            _instance = new Moon();
        return _instance;
    }
}