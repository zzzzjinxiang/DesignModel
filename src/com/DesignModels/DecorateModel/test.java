package com.DesignModels.DecorateModel;

public class test {
    public static void main(String[] args){
        DBUser user = new JpaUse();
        DBUser user2 = new Decorator(user);
        user2.useJpa();
    }
}
