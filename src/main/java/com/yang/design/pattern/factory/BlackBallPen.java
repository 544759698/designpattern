package com.yang.design.pattern.factory;

public class BlackBallPen extends BallPen {
    @Override
    public PenCore getPenCore() {
        return new BlackPenCore();
    }
}
