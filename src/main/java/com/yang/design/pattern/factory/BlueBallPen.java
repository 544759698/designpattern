package com.yang.design.pattern.factory;

public class BlueBallPen extends BallPen {
    @Override
    public PenCore getPenCore() {
        return new BluePenCore();
    }
}
