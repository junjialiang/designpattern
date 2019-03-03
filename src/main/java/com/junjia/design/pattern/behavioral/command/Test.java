package com.junjia.design.pattern.behavioral.command;

/**
 * Created by junjia
 */
public class Test {
    public static void main(String[] args) {
        CourseVideo courseVideo = new CourseVideo("Java设计模式精讲 -- By Junjia");
        OpenCourseVideoCommand openCourseVideoCommand = new OpenCourseVideoCommand(courseVideo);
        CloseCourseVideoCommand closeCourseVideoCommand = new CloseCourseVideoCommand(courseVideo);

        Staff staff = new Staff();
        staff.addCommand(openCourseVideoCommand);
        staff.addCommand(closeCourseVideoCommand);

        staff.executeCommands();
    }
}
