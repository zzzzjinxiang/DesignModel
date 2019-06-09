package com.DesignModels.AdapterModels.AdapterObj;


import com.DesignModels.AdapterModels.AdapterClass.Targetable;

public class test {
    public static void main(String[] args){
        Source source = new Source();
        Targetable target = new AdapterObj(source);
        target.method1();
        target.method2();
    }
}
