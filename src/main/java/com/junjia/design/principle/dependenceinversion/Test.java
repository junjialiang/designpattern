package com.junjia.design.principle.dependenceinversion;

/**
 * Created by junjia
 */
public class Test {

    //v1
//    public static void main(String[] args) {
//        Junjia junjia = new Junjia();
//        junjia.studyJavaCourse();
//        junjia.studyFECourse();
//    }

    //v2
//    public static void main(String[] args) {
//        Junjia junjia = new Junjia();
//        junjia.studyImoocCourse(new JavaCourse());
//        junjia.studyImoocCourse(new FECourse());
//        junjia.studyImoocCourse(new PythonCourse());
//    }

    //v3
//    public static void main(String[] args) {
//        Junjia junjia = new Junjia(new JavaCourse());
//        junjia.studyImoocCourse();
//    }
    public static void main(String[] args) {
        Junjia junjia = new Junjia();
        junjia.setiCourse(new JavaCourse());
        junjia.studyImoocCourse();

        junjia.setiCourse(new FECourse());
        junjia.studyImoocCourse();

    }


}
