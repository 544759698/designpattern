package com.yang.design.pattern.observe.original;

/**
 * Created by Administrator on 2018/7/30.
 */
public class Student implements Observer {

    Subject subject;

    public Student(Subject subject) {
        this.subject = subject;
        this.subject.addObserver(this);
    }

    @Override
    public void hearPhone(String msg) {
        System.out.println("学生接电话，找工作！！！");
    }
}
