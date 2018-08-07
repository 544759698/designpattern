package com.yang.design.pattern.observe.jdk;


/**
 * Created by Administrator on 2018/7/30.
 */
public class Application {
    public static void main(String[] args) {
        JobSubject jobSubject = new JobSubject();
        Student s1 = new Student();
        Worker w1 = new Worker();
        jobSubject.addObserver(s1);
        jobSubject.addObserver(w1);
        jobSubject.setMsg("123");
        jobSubject.notifyObservers("123");
        jobSubject.setMsg("1234");
        jobSubject.notifyObservers("1234");
    }
}
