package com.junjia.design.pattern.behavioral.observer.guavatest;

import com.google.common.eventbus.EventBus;

/**
 * Created by junjia
 */
public class GuavaEventTest {
    public static void main(String[] args) {
        EventBus eventbus = new EventBus();
        GuavaEvent guavaEvent = new GuavaEvent();
        eventbus.register(guavaEvent);
        eventbus.post("post的内容");
    }

}
