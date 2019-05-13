package com.DesignModels.AdapterSimple;

public class test {
    public static void main(String[] args){
        DBUser user = new adapter();
        user.useMyba();
        user.useJpa();
    }
}
