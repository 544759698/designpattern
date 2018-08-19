package com.yang.design.pattern.factory.abstrac;

public class Application {
    public static void main(String[] args) {
        Shop shop = new Shop();
        ClothesFactory factory = new BeijingClothesFactory();
        shop.giveSuit(factory, 100, 80, 180);
        factory = new ShanghaiClothesFactory();
        shop.giveSuit(factory, 80, 60, 160);
    }
}
