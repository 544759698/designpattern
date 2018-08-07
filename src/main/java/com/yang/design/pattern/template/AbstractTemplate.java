package com.yang.design.pattern.template;

import java.io.File;

/**
 * Created by Administrator on 2018/8/7.
 */
public abstract class AbstractTemplate {
    File dir;
    File[] allFiles;

    public AbstractTemplate(File dir) {
        this.dir = dir;
    }

    public abstract void sort();

    public abstract void printDir();

    public final void showDir() {
        allFiles = this.dir.listFiles();
        sort();
        printDir();
    }
}
