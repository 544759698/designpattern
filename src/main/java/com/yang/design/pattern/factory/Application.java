package com.yang.design.pattern.factory;

public class Application {
    public static void main(String[] args) {
        PenCore penCore;
        BallPen ballPen = new BlueBallPen();
        penCore = ballPen.getPenCore();
        penCore.write("--你好--");
        ballPen = new RedBallPen();
        penCore = ballPen.getPenCore();
        penCore.write("--HELLO--");
        ballPen = new BlackBallPen();
        penCore = ballPen.getPenCore();
        penCore.write("--NICE--");
    }
}
