package com.junjia.design.pattern.structural.adapter.classadapter;

/**
 * Created by junjia
 */
public class Adapter extends Adaptee implements Target{
    @Override
    public void request() {
        //...
        super.adapteeRequest();
        //...
    }
}
