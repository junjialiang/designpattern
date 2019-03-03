package com.junjia.design.principle.demeter;


/**
 * Created by junjia
 */
public class Boss {

    public void commandCheckNumber(TeamLeader teamLeader){
        teamLeader.checkNumberOfCourses();
    }

}
