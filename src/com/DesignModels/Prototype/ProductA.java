package com.DesignModels.Prototype;

import com.DesignModels.FactoryModel.Product;

public class ProductA{

    private String name;

    public ProductA(String name){
        this.name = name;
    }

    public void updateName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
