package com.yang.design.pattern.template;

import java.io.File;

/**
 * Created by Administrator on 2018/8/7.
 */
public class Application {
    public static void main(String[] args) {
        File f = new File("D:/");
        AbstractTemplate template1 = new TemplateSort(f);
        template1.showDir();
        AbstractTemplate template2 = new TemplateUnsort(f);
        template2.showDir();
    }
}
