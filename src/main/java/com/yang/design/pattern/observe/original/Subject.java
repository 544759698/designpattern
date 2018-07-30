package com.yang.design.pattern.observe.original;

/**
 * Created by Administrator on 2018/7/30.
 * 主题接口
 */
public interface Subject {

    public void addObserver(Observer observer);

    public void delObserver(Observer observer);

    public void notifyObserver();
}
