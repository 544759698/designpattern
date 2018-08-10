package com.yang.design.pattern.facade;

/**
 * 门面类
 * Created by Administrator on 2018/8/10.
 */
public class WordAdFacade {
    private CheckWord checkWord;
    private Charge charge;
    private TypeSetting typeSetting;

    private String advertiseMent;

    public WordAdFacade(String advertiseMent) {
        this.advertiseMent = advertiseMent;
        this.checkWord = new CheckWord(this.advertiseMent);
        this.charge = new Charge(checkWord);
        this.typeSetting = new TypeSetting(this.advertiseMent);
    }

    public void doAdvertise() {
        this.checkWord.setChargeAmount();
        this.charge.getCharge();
        this.typeSetting.printType();
    }
}
