package com.DesignModels.StateModel;

import com.DesignModels.TipsEnum.OrderEnum;

public class FreeState implements ConditionModel {
    @Override
    public int handle(){
        return OrderEnum.FREE.getCode();
    }

}
