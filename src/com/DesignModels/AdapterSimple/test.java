package com.DesignModels.AdapterSimple;

public class test {
    public static void main(String[] args){
        /**
         * 类的适配器
         */
        Targetable target = new Adapter();
        target.method1();
        target.method2();
    }
}
