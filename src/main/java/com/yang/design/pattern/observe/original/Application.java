package com.yang.design.pattern.observe.original;

/**
 * Created by Administrator on 2018/7/29.
 */
public class Application {
    public static void main(String[] args) {
        JobSubject jobSubject = new JobSubject();
        Student s1 = new Student(jobSubject);
        Worker w1 = new Worker(jobSubject);
        jobSubject.setMsg("校招发布");
        jobSubject.notifyObserver();
        jobSubject.setMsg("社招发布");
        jobSubject.notifyObserver();
    }
}
