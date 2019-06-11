package com.DesignModels.ShareModel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class ConnectionPool {
    /**
     * 对于有共同属性的实例，只需创建一次即可实现多次使用
     */

    private ArrayList<Connection> pool;

    private String url = "jdbc:mysql://localhost:3306/test";
    private String username = "root";
    private String password = "xxxxxxxx";
    private String driverClassName = "com.mysql.jdbc.Driver";

    private int poolSize = 10;
    private static ConnectionPool instance = null;
    Connection conn = null;

    private ConnectionPool() {
        pool = new ArrayList<Connection>(poolSize);

        for (int i = 0; i < poolSize; i++) {
            try {
                Class.forName(driverClassName);
                conn = DriverManager.getConnection(url, username, password);
                pool.add(conn);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void release(){
        pool.add(conn);
    }

    public synchronized Connection getConnection(){
        if(pool.size()>0)
        {
            Connection conn = pool.get(0);
            pool.remove(conn);
            return conn;
        }else return null;
    }
}
