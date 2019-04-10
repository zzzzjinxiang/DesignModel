package com.DesignModels.AdapterModel;

public class Client {
    public void work(Target t){
        t.handleReq();
    }

    public static void main(String[] args){
        Client c = new Client();
        Target t = new Adapter();
        c.work(t);
    }
}
