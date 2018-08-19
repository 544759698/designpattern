package com.yang.design.pattern.factory.abstrac;

public class ShanghaiClothesFactory extends ClothesFactory {

    ShanghaiClothesFactory() {
        name = "上海";
    }

    @Override
    public UpperClothes createUpperClothes(int chestSize, int height) {
        return new CowboyUpperClothes(chestSize, height);
    }

    @Override
    public Trousers createTrousers(int waistSize, int height) {
        return new CowboyTrousers(waistSize, height);
    }
}
