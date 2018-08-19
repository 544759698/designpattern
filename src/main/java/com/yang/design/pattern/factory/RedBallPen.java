package com.yang.design.pattern.factory;

public class RedBallPen extends BallPen {
    @Override
    public PenCore getPenCore() {
        return new RedPenCore();
    }
}
