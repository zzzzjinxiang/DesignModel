package com.DesignModels.AdapterModel;

public class Adapter implements JDBCDB {
    private MybatisDB mybatisDB;

    public Adapter(MybatisDB mybatisDB) {
        this.mybatisDB = mybatisDB;
    }

    @Override
    public String connectDB(String cont) {
        System.out.println("adapter try to connect Mybatis.....");
        return mybatisDB.connectDB(cont);
    }

    @Override
    public int writeDB(String msg) {
        System.out.println("adapter try to write Mybatis......");
        return mybatisDB.writeDB(msg);
    }

    @Override
    public String getName() {
        return mybatisDB.getName();
    }
}
