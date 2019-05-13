package com.DesignModels.FactoryModel;

import java.util.ArrayList;
import java.util.List;

public class Builder {

    private List<Product> list = new ArrayList<>();

    public List productA(int nums){
        if(!list.isEmpty()) {
            list.clear();
        }
        for (int i = 0; i < nums; i++) {
            list.add(new ProductA());
        }
        return list;
    }

    public List productB(int nums){
        if(!list.isEmpty()) {
            list.clear();
        }
        for (int i = 0; i < nums; i++) {
            list.add(new ProductB());
        }
        return list;
    }
}
