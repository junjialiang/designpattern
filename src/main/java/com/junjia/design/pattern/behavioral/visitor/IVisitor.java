package com.junjia.design.pattern.behavioral.visitor;

/**
 * Created by junjia
 */
public interface IVisitor {

    void visit(FreeCourse freeCourse);

    void visit(CodingCourse codingCourse);


}
