package com.yang.design.pattern.observe.original;

/**
 * Created by Administrator on 2018/7/30.
 */
public class Worker implements Observer {

    Subject subject;

    public Worker(Subject subject) {
        this.subject = subject;
        this.subject.addObserver(this);
    }

    @Override
    public void hearPhone(String msg) {
        System.out.println("工人接电话，找工作！！！");
    }
}
