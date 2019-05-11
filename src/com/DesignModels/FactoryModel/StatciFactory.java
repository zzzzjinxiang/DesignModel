package com.DesignModels.FactoryModel;

public class StatciFactory {

    public static Product StatciFactory(String msg){
        if(msg.equals('A'))
            return new ProductA();
        else if(msg.equals('B'))
            return new ProductB();
        else throw new IllegalArgumentException("No such product");
    }
}
