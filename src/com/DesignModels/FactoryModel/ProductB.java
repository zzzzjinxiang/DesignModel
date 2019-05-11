package com.DesignModels.FactoryModel;

public class ProductB implements Product{

    @Override
    public void getProduct(String msg) {
        if(msg.equals("B"))
            System.out.println("execute "+ msg);
    }
}
