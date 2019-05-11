package com.DesignModels.AdapterModel;

public interface JDBCDB {
    String connectDB(String cont);
    int writeDB(String cont);
    String getName();
}
