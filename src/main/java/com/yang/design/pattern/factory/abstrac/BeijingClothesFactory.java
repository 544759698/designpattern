package com.yang.design.pattern.factory.abstrac;

public class BeijingClothesFactory extends ClothesFactory {

    BeijingClothesFactory() {
        name = "北京";
    }

    @Override
    public UpperClothes createUpperClothes(int chestSize, int height) {
        return new WesternUpperClothes(chestSize, height);
    }

    @Override
    public Trousers createTrousers(int waistSize, int height) {
        return new WesternTrousers(waistSize, height);
    }
}
