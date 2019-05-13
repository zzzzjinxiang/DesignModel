package com.DesignModels.FactoryModel;

public class CreateProduct {

    public Product AProduct(){
        return new ProductA();
    }

    public Product BProduct(){
        return new ProductB();
    }
}
