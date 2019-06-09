package com.DesignModels.AdapterSimple;

public class Adapter extends Source implements Targetable{
    @Override
    public void method2(){
        System.out.println("this is adapter method");
    }
}
