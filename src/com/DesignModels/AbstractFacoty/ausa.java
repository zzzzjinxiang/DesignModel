package com.DesignModels.AbstractFacoty;

public class ausa implements computer {

    String msg;

    @Override
    public void send(String msg) {
        System.out.println("ausa sender "+ msg);
    }

    @Override
    public void read() {
        this.msg  = "low batery";
        send(msg);
    }
}
