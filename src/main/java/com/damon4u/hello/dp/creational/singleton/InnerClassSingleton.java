package com.damon4u.hello.dp.creational.singleton;

/**
 * Description:
 *
 * @author damon4u
 * @version 2016-10-13 11:22
 */
public class InnerClassSingleton {

    private static class SingletonHolder {
        private static final InnerClassSingleton INSTANCE = new InnerClassSingleton();
    }

    private InnerClassSingleton() {

    }

    public static InnerClassSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
