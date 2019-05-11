package com.DesignModels.AdapterModel;

public class test {

    public static void main(String[] args){
        JDBCDB JDBCDB = new JDBCImpl();
        DBUser user = new JavaDB();
        user.runCon(JDBCDB,"JDBC");
        System.out.println("\n");
        MybatisDB mybatisDB = new MybatisImpl();
        JDBCDB adapter = new Adapter(mybatisDB);
        user.runCon(adapter,"Mybatis");
    }
}
