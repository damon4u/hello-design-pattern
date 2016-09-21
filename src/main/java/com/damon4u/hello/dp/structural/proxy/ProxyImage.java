package com.damon4u.hello.dp.structural.proxy;

/**
 * Description:
 * ProxyImage is a a proxy class to reduce memory footprint of RealImage object loading.
 *
 * @author damon4u
 * @version 2016-09-21 16:20
 */
public class ProxyImage implements Image {

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        // reduce loadFromDisk
        if (this.realImage == null) {
            realImage = new RealImage(fileName);
        }
        // dispatch the method invocation on the proxy to its invocation handler
        realImage.display();
    }
}
