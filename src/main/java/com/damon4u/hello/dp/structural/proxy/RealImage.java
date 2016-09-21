package com.damon4u.hello.dp.structural.proxy;

/**
 * Description:
 * Create a concrete class implementing the same interface.
 *
 * @author damon4u
 * @version 2016-09-21 16:15
 */
public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading " + fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }
}
