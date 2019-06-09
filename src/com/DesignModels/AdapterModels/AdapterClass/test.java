package com.DesignModels.AdapterModels.AdapterClass;

import com.DesignModels.AdapterModels.AdapterClass.Adapter;
import com.DesignModels.AdapterModels.AdapterClass.Targetable;

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
