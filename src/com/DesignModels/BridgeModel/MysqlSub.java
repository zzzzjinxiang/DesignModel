package com.DesignModels.BridgeModel;

public class MysqlSub implements Driver {

    @Override
    public void use() {
        System.out.println("Mysql executes");
    }
}
