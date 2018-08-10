package com.yang.design.pattern.facade;

/**
 * Created by Administrator on 2018/8/10.
 */
public class Application {
    public static void main(String[] args) {
        WordAdFacade facade = new WordAdFacade("月光电脑，价格6666元，联系电话：1234567");
        facade.doAdvertise();
    }
}
