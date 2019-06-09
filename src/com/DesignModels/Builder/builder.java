package com.DesignModels.Builder;

import com.DesignModels.FactoryModel.Product;
import com.DesignModels.FactoryModel.ProductA;
import com.DesignModels.FactoryModel.ProductB;

import java.util.ArrayList;
import java.util.List;

public class builder {
    private int numA;
    private int numB;

    public builder(int numA,int numB){
        this.numA = numA;
        this.numB = numB;
    }

    public builder(){}

    public List<Product> buildA(){
        List<Product> list = new ArrayList<>();
        int defalut = 10;
        if(numA!=0){
            defalut = numA;
        }
        for(int i=0;i<defalut;i++){
            list.add(new ProductA());
        }
        return list;
    }

    public List<Product> buildB(){
        List<Product> list = new ArrayList<>();
        int defalut = 10;
        if(numB!=0){
            defalut = numB;
        }
        for(int i = 0;i<defalut;i++) {
            list.add(new ProductB());
        }
        return list;
    }
}
