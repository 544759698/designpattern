package com.yang.design.pattern.factory.abstrac;

public class WesternUpperClothes extends UpperClothes {
    private int chestSize;
    private int height;

    WesternUpperClothes(int chestSize, int height) {
        this.chestSize = chestSize;
        this.height = height;
    }

    @Override
    public int getChestSize() {
        return chestSize;
    }

    @Override
    public int getHeight() {
        return height;
    }
}
