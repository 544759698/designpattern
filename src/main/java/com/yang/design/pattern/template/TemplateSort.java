package com.yang.design.pattern.template;

import java.io.File;

/**
 * Created by Administrator on 2018/8/7.
 */
public class TemplateSort extends AbstractTemplate {

    public TemplateSort(File dir) {
        super(dir);
    }

    @Override
    public void sort() {
        System.out.println("--------------------This is TemplateSort--------------------");
    }

    @Override
    public void printDir() {
        for (File f : this.allFiles) {
            System.out.println(f.getName());
        }
    }
}
