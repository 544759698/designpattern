package com.yang.design.pattern.factory.abstrac;

public abstract class ClothesFactory {
    public String name;

    public abstract UpperClothes createUpperClothes(int chestSize, int height);

    public abstract Trousers createTrousers(int waistSize, int height);
}
