package com.DesignModels.CommandModel;

public class test {
    public static void main(String[] args){
        Receiver receiver = new Receiver();
        Command command = new Myco(receiver);
        Invoker invoker = new Invoker(command);
        invoker.action();
    }
}
