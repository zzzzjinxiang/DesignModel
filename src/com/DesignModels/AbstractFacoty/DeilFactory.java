package com.DesignModels.AbstractFacoty;

public class DeilFactory implements Factory{

    @Override
    public computer newProduct() {
        return new deil();
    }
}
