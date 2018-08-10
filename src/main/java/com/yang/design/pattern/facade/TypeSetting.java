package com.yang.design.pattern.facade;

/**
 * 广告排版
 * Created by Administrator on 2018/8/10.
 */
public class TypeSetting {
    private String advertiseMent;

    public TypeSetting(String advertiseMent) {
        this.advertiseMent = advertiseMent;
    }

    public void printType() {
        System.out.println("广告排版格式");
        System.out.println("**********************");
        System.out.println(advertiseMent);
        System.out.println("**********************");
    }
}
