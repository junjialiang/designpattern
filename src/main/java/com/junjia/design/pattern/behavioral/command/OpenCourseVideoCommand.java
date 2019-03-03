package com.junjia.design.pattern.behavioral.command;

/**
 * Created by junjia
 */
public class OpenCourseVideoCommand implements Command {
    private CourseVideo courseVideo;

    public OpenCourseVideoCommand(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    @Override
    public void execute() {
        courseVideo.open();
    }
}
