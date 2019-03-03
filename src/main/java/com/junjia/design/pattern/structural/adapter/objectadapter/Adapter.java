package com.junjia.design.pattern.structural.adapter.objectadapter;

/**
 * Created by junjia
 */
public class Adapter implements Target{
    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        //...
        adaptee.adapteeRequest();
        //...
    }
}
