package com.yang.design.pattern.factory.abstrac;

public class CowboyUpperClothes extends UpperClothes {
    private int chestSize;
    private int height;

    CowboyUpperClothes(int chestSize, int height) {
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
