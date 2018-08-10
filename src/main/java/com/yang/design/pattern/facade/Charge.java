package com.yang.design.pattern.facade;

/**
 * 计算广告费用
 * Created by Administrator on 2018/8/10.
 */
public class Charge {
    private final int baseCharge = 12;
    CheckWord checkWord;

    public Charge(CheckWord checkWord) {
        this.checkWord = checkWord;
    }

    public void getCharge() {
        int charge = baseCharge + checkWord.getAmount();
        System.out.println("广告费用：" + String.valueOf(charge) + "元");
    }
}
