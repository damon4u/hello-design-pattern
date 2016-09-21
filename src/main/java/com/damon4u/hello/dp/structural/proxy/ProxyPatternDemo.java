package com.damon4u.hello.dp.structural.proxy;

/**
 * Description:
 * Use the ProxyImage to get object of RealImage class when required.
 *
 * @author damon4u
 * @version 2016-09-21 16:28
 */
public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("a.jpg");
        //image will be loaded from disk
        image.display();
        System.out.println("");

        //image will not be loaded from disk
        image.display();
    }
}
