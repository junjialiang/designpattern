package com.junjia.design.principle.singleresponsibility;

/**
 * Created by junjia
 */
public interface ICourse {
    String getCourseName();
    byte[] getCourseVideo();

    void studyCourse();
    void refundCourse();

}
