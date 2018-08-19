package com.yang.design.pattern.factory.abstrac;

public class WesternTrousers extends Trousers {
    private int waistSize;
    private int height;

    WesternTrousers(int waistSize, int height) {
        this.waistSize = waistSize;
        this.height = height;
    }

    @Override
    public int getWaistSize() {
        return waistSize;
    }

    @Override
    public int getHeight() {
        return height;
    }
}
