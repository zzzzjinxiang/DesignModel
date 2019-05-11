package com.DesignModels.AdapterModel;

public class JavaDB implements DBUser {

    final private String name = "Java";
    final private String[] app = {"JDBC","Mybatis"};

    @Override
    public void runCon(JDBCDB JDBCDB, String method) {
        String way = JDBCDB.connectDB(method);
        for(String s:app){
            if(way.equals(s)) {
                System.out.println("Begin to run JavaDB" + s);
                System.out.println(JDBCDB.writeDB(s));
                return;
            }
        }
        System.out.println("No such app:"+way+".status :"+ JDBCDB.writeDB(way));
    }
}
