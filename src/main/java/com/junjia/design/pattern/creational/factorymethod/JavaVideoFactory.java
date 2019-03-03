package com.junjia.design.pattern.creational.factorymethod;

/**
 * Created by junjia
 */
public class JavaVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
