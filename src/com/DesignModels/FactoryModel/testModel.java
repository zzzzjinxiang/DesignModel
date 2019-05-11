package com.DesignModels.FactoryModel;

public class testModel {

    public static void main(String[] args){
        Product product = CreateProduct.createProduct("A");
        product.getProduct("C");
    }
}
