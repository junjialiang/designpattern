package com.junjia.design.pattern.creational.prototype.abstractprototype;

/**
 * Created by junjia
 */
public abstract class A implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
