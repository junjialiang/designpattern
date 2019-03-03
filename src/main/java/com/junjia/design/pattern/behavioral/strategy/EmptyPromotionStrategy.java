package com.junjia.design.pattern.behavioral.strategy;

/**
 * Created by junjia
 */
public class EmptyPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("无促销活动");
    }
}
