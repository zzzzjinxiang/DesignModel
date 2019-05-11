package com.DesignModels.AdapterModel;

public interface MybatisDB {
    String connectDB(String cont);
    int writeDB(String cont);
    String getName();
}
