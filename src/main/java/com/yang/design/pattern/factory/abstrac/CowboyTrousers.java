package com.yang.design.pattern.factory.abstrac;

public class CowboyTrousers extends Trousers {
    private int waistSize;
    private int height;

    CowboyTrousers(int waistSize, int height) {
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
