package com.junjia.design.pattern.creational.abstractfactory;

/**
 * Created by junjia
 */
public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Java课程视频");
    }
}
