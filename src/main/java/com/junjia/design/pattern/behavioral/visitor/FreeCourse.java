package com.junjia.design.pattern.behavioral.visitor;

/**
 * Created by junjia
 */
public class FreeCourse extends Course {

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
