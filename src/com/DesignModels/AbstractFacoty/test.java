package com.DesignModels.AbstractFacoty;

public class test {

    public static void main(String[] args){
        Factory factory = new AusaFactory();
        computer computer = factory.newProduct();
        computer.read();
    }
}
