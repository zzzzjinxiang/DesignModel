package com.DesignModels.StateModel;

import com.DesignModels.TipsEnum.OrderEnum;

public class SettleState implements ConditionModel {
    @Override
    public int handle(){
        return OrderEnum.SETTLEIN.getCode();
    }
}
