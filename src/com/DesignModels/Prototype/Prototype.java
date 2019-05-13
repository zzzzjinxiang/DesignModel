package com.DesignModels.Prototype;

public class Prototype implements Cloneable{

    private String name;
    private ProductA productA;

    public Prototype(String name,ProductA productA){
        this.name = name;
        this.productA = productA;
    }

    public ProductA getProductA(){
        return productA;
    }

    public void updateProduct(ProductA productA){
        this.productA = productA;
    }

    public String getName(){
        return name;
    }


    public Object clone(){
        try {
            Prototype proto = (Prototype) super.clone();
            return proto;
        }catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        return null;
    }
}
