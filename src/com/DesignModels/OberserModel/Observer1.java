package com.DesignModels.OberserModel;

public class Observer1 implements  Observer{
    @Override
    public void update(String msg) {
        System.out.println(msg+"->ok");
    }

}
