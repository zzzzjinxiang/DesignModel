package com.DesignModels.AdapterModel;

public class MybatisImpl implements MybatisDB {
    final private String msg = "Mybatis";

    @Override
    public String connectDB(String cont) {
        if(msg.equals(cont)){
            System.out.println(msg+" execution");
            return cont;
        }
        System.out.println("fail to connect");
        return cont;
    }

    @Override
    public int writeDB(String cont) {
        if(connectDB(cont)!=null)
            return 1;
        return 0;
    }

    @Override
    public String getName(){
        return this.msg;
    }
}
