package com.yang.design.pattern.factory;

public class RedPenCore extends PenCore {
    RedPenCore() {
        color = "红色";
    }

    @Override
    public void write(String s) {
        System.out.println(color + ":" + s);
    }
}
