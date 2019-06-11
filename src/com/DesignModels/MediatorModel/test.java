package com.DesignModels.MediatorModel;

public class test {
    public static void main(String[] args){
        Mediator mediator = new MyMediator();
        mediator.createMediator();
        mediator.workAll();
    }
}
