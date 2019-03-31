package com.DesignModels.StateModel;

import com.DesignModels.TipsEnum.OrderEnum;

public class OrderState implements ConditionModel {

    @Override
    public int handle(){
        return OrderEnum.ORDERED.getCode();
    }

}
