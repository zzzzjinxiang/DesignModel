package com.DesignModels.BridgeModel;

public class Client extends BridgeDriverManage {
    @Override
    public void use() {
        getDriver().use();
    }
}
