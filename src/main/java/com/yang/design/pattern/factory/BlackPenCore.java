package com.yang.design.pattern.factory;

public class BlackPenCore extends PenCore {
    BlackPenCore() {
        color = "黑色";
    }

    @Override
    public void write(String s) {
        System.out.println(color + ":" + s);
    }
}
