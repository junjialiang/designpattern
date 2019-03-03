package com.junjia.design.pattern.structural.adapter.classadapter;

/**
 * Created by junjia
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("concreteTarget目标方法");
    }

}
