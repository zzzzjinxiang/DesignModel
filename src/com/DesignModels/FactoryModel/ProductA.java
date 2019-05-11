package com.DesignModels.FactoryModel;

public class ProductA implements Product {

    @Override
    public void getProduct(String msg) {
        if(msg.equals("A"))
            System.out.println("execute "+ msg);
    }
}
