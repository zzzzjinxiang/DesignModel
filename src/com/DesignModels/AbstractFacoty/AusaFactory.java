package com.DesignModels.AbstractFacoty;

public class AusaFactory implements Factory{

    @Override
    public computer newProduct() {
        return new ausa();
    }
}
