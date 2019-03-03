package com.junjia.design.pattern.creational.factorymethod;

/**
 * Created by junjia
 */
public class PythonVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
