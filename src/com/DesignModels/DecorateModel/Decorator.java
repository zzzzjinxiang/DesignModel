package com.DesignModels.DecorateModel;

public class Decorator implements DBUser {

    private DBUser user;
    public Decorator(DBUser user){
        super();
        this.user = user;
    }

    @Override
    public void useJpa() {
        user.useJpa();
        System.out.println("use mybatis");
    }
}
