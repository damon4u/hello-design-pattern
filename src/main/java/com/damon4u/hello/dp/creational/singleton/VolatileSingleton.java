package com.damon4u.hello.dp.creational.singleton;

/**
 * Description:
 *
 * @author damon4u
 * @version 2016-10-13 11:19
 */
public class VolatileSingleton {

    private volatile static VolatileSingleton instance;

    private VolatileSingleton() {

    }

    public static VolatileSingleton getInstance() {
        if (instance == null) {
            synchronized (VolatileSingleton.class) {
                if (instance == null) {
                    instance = new VolatileSingleton();
                }
            }
        }
        return instance;
    }
}
