package com.DesignModels.Builder;

import com.DesignModels.FactoryModel.Product;

import java.util.List;

public class test {
    public static void main(String[] args){
        builder builder = new builder(2,1);
        List<Product> listA = builder.buildA();
        List<Product> listB = builder.buildB();
        for(Product p:listA){
            p.getProduct("this is A");
        }
        for(Product p:listB){
            p.getProduct("this is B");
        }
    }
}
