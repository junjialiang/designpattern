package com.junjia.design.principle.dependenceinversion;

/**
 * Created by junjia
 */
public class Junjia {

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    private ICourse iCourse;



    public void studyImoocCourse(){
        iCourse.studyCourse();
    }






}
