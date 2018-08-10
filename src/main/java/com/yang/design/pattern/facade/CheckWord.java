package com.yang.design.pattern.facade;

import org.apache.commons.lang.StringUtils;

/**
 * 检查广告字数
 * Created by Administrator on 2018/8/10.
 */
public class CheckWord {
    private final int baseAmount = 10;
    private String advertiseMent;
    private int amount;

    public CheckWord(String advertiseMent) {
        this.advertiseMent = advertiseMent;
    }

    public void setChargeAmount() {
        amount = baseAmount + (StringUtils.isEmpty(advertiseMent) ? 0 : advertiseMent.length());
    }

    public int getAmount() {
        return amount;
    }
}
