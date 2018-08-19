package com.yang.design.pattern.factory.abstrac;

public class Shop {
    UpperClothes cloth;
    Trousers trousers;

    public void giveSuit(ClothesFactory factory, int chestSize, int waistSize, int height) {
        cloth = factory.createUpperClothes(chestSize, height);
        trousers = factory.createTrousers(waistSize, height);
        showMsg(factory.name);
    }

    private void showMsg(String factoryName) {
        System.out.println("<套装信息>");
        System.out.println(factoryName + ":");
        System.out.println("胸围：" + cloth.getChestSize());
        System.out.println("腰围：" + trousers.getWaistSize());
        System.out.println("身高：" + trousers.getHeight());
    }
}
