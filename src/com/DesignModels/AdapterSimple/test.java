package com.DesignModels.AdapterSimple;

public class test {
    public static void main(String[] args){
        DBUser user = new adapter();
        user.useMyba();
        user.useJpa();
        //对象的适配器
        JpaUse use = new JpaUse();
        user = new Wrapper(use);
        user.useJpa();
        user.useMyba();
        //Wrapper2实现对接口的适配，继承该方法即可。
    }
}
