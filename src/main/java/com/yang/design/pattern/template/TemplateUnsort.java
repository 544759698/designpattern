package com.yang.design.pattern.template;

import java.io.File;

/**
 * Created by Administrator on 2018/8/7.
 */
public class TemplateUnsort extends AbstractTemplate {

    public TemplateUnsort(File dir) {
        super(dir);
    }

    @Override
    public void sort() {
        System.out.println("--------------------This is TemplateUnsort--------------------");
    }

    @Override
    public void printDir() {
        for (File f : allFiles) {
            System.out.println(f.getName());
        }
    }
}
