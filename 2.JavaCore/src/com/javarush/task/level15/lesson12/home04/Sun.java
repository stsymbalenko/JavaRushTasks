package com.javarush.test.level15.lesson12.home04;

/**
 * Created by s.tsymbalenko on 30.09.2016.
 */
public final class Sun implements Planet{
    private static Sun _instance = null;

    Sun() {}

    public static synchronized Sun getInstance() {
        if (_instance == null)
            _instance = new Sun();
        return _instance;
    }
}
