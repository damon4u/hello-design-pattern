package com.damon4u.hello.dp.creational.singleton;

/**
 * Description:
 *
 * @author damon4u
 * @version 2016-10-13 11:21
 */
public class FinalSingleton {

    private static final FinalSingleton instance = new FinalSingleton();

    private FinalSingleton() {

    }

    public static FinalSingleton getInstance() {
        return instance;
    }
}
