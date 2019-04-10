package com.DesignModels.AdapterModel;

public class Adapter extends Aaptee implements Target {

    public void handleReq(){
        super.request();
    }

}
