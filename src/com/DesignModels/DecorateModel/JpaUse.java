package com.DesignModels.DecorateModel;

public class JpaUse implements DBUser{

    @Override
    public void useJpa(){
        System.out.println("use jpa");
    }
}
