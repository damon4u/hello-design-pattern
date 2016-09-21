package com.damon4u.hello.dp.structural.proxy;

/**
 * Description:
 * A common interface that the concrete classes and its proxy should implement both.
 * In this way, the proxy could expose the same methods as its invocation handler,
 * and control access to it.
 *
 * @author damon4u
 * @version 2016-09-21 16:02
 */
public interface Image {
    void display();
}
