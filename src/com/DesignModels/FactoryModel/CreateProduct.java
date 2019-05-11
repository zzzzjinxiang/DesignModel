package com.DesignModels.FactoryModel;

public class CreateProduct {

    private static final String[] lists = {"A","B"};

    public static Product createProduct(String contMsg) {
        int i = 0;
        while(i<lists.length-1){
            if(contMsg.equals("A"))
                return new ProductA();
            else return new ProductB();
        }
        return null;
    }
}
