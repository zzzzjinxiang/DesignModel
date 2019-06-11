package com.DesignModels.CommandModel;


public class Myco implements  Command{
    private Receiver receiver;
    public Myco(Receiver receiver){
        this.receiver = receiver;
    }
    @Override
    public void exe() {
        receiver.action();
    }
}
