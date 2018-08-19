package com.yang.design.pattern.factory;

public class BluePenCore extends PenCore {
    BluePenCore() {
        color = "蓝色";
    }

    @Override
    public void write(String s) {
        System.out.println(color + ":" + s);
    }
}
