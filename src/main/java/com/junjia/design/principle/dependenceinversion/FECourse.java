package com.junjia.design.principle.dependenceinversion;

/**
 * Created by junjia
 */
public class FECourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("junjia在学习FE课程");
    }

}
