package com.yang.design.pattern.observe.jdk;

import org.apache.commons.lang.StringUtils;

import java.util.Observable;

/**
 * Created by Administrator on 2018/7/30.
 */
public class JobSubject extends Observable {
    String msg;

    public void setMsg(String msg) {
        if (StringUtils.isNotEmpty(msg) && !msg.equals(this.msg)) {
            setChanged();
            this.msg = msg;
        }
    }
}
