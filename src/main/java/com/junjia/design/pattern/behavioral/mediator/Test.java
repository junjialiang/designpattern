package com.junjia.design.pattern.behavioral.mediator;

/**
 * Created by junjia
 */
public class Test {
    public static void main(String[] args) {
        User junjia = new User("Junjia");
        User tom= new User("Tom");

        junjia.sendMessage(" Hey! Tom! Let's learn Design Pattern");
        tom.sendMessage("OK! Junjia");
    }


}
