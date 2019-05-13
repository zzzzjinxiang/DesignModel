package com.DesignModels.AdapterSimple;

public class adapter extends JpaUse implements DBUser{

    @Override
    public void useMyba() {
        System.out.println("user mybatis");
    }
}
