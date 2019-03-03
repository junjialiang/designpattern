package com.junjia.design.pattern.creational.factorymethod;

/**
 * Created by junjia
 */
public class FEVideoFactory extends VideoFactory{
    @Override
    public Video getVideo() {
        return new FEVideo();
    }
}
