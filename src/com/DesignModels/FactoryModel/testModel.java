package com.DesignModels.FactoryModel;

import java.util.ArrayList;

public class testModel {

    public static void main(String[] args){
        //静态工厂
        Product product = StatciFactory.ProductA();
        product.getProduct("C");
        //普通工厂
        CreateProduct factory = new CreateProduct();
        Product product1 = factory.BProduct();
        product1.getProduct("B");
        //建造者
        Builder builder = new Builder();
        ArrayList<Product> list = (ArrayList<Product>) builder.productA(2);
        for(Product product2:list){
            product2.getProduct("B");
        }
    }
}
