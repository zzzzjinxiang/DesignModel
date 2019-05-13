package com.DesignModels.FactoryModel;

public class StatciFactory {

    public static Product ProductA(){
        return new ProductA();
    }

    public static Product ProductB(){
        return new ProductB();
    }
}
