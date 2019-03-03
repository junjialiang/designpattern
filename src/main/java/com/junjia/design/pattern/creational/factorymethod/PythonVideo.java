package com.junjia.design.pattern.creational.factorymethod;

/**
 * Created by junjia
 */
public class PythonVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Python课程视频");
    }
}
