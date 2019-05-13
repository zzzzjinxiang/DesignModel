package com.DesignModels.OberserModel;

public class Observer2 implements  Observer{

    @Override
    public void update(String msg) {
        System.out.println(msg+"->ok");
    }

}
