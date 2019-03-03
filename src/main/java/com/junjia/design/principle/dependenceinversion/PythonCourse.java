package com.junjia.design.principle.dependenceinversion;

/**
 * Created by junjia
 */
public class PythonCourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("junjia在学习Python课程");
    }
}
