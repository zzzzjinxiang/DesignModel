package com.DesignModels.AdapterModels.AdapterObj;

import com.DesignModels.AdapterModels.AdapterClass.Targetable;


public class AdapterObj implements Targetable {

    private Source source;
    public AdapterObj(Source source){
        super();
        this.source = source;
    }

    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        System.out.println("this is obj adapter");
    }
}
