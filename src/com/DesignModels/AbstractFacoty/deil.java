package com.DesignModels.AbstractFacoty;

public class deil implements computer {
    String msg;

    @Override
    public void send(String msg) {
        System.out.println("deil sender "+ msg);
    }

    @Override
    public void read() {
        this.msg  = "high batery";
        send(msg);
    }
}
