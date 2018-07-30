package com.yang.design.pattern.observe.original;


import java.util.ArrayList;

import org.apache.commons.lang.StringUtils;

/**
 * Created by Administrator on 2018/7/30.
 */
public class JobSubject implements Subject {
    ArrayList<Observer> personList;
    String msg;
    boolean changed;

    public JobSubject() {
        personList = new ArrayList<>();
        msg = "";
        changed = false;
    }

    public void setMsg(String msg) {
        if (StringUtils.isNotEmpty(msg) && !msg.equals(this.msg)) {
            changed = true;
            this.msg = msg;
        } else {
            changed = false;
        }
    }

    @Override
    public void addObserver(Observer observer) {
        if (!personList.contains(observer)) {
            personList.add(observer);
        }
    }

    @Override
    public void delObserver(Observer observer) {
        if (personList.contains(observer)) {
            personList.remove(observer);
        }
    }

    @Override
    public void notifyObserver() {
        if (changed) {
            for (Observer item : personList) {
                item.hearPhone(this.msg);
            }
        }
        changed = false;
    }
}
