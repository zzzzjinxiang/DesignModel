package com.DesignModels.AdapterSimple;

public class Wrapper implements DBUser {

    private JpaUse jpaUse;

    public Wrapper(JpaUse user){
        super();
        this.jpaUse = user;
    }

    @Override
    public void useMyba() {
        System.out.println("user mybatis");
    }

    @Override
    public void useJpa() {
        jpaUse.useJpa();
    }
}
