package com.DesignModels.BridgeModel;

public abstract class BridgeDriverManage {
    private Driver driver;

    public void use(){
        driver.use();
    }

    public Driver getDriver(){
        return driver;
    }

    public void setDriver(Driver driver){
        this.driver = driver;
    }
}
