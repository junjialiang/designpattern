package com.junjia.design.pattern.behavioral.iterator;

/**
 * Created by junjia.
 */
public interface CourseAggregate {

    void addCourse(Course course);
    void removeCourse(Course course);

    CourseIterator getCourseIterator();



}
