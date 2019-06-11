package com.DesignModels.BridgeModel;

public class test {

    public static void main(String[] args) {

        BridgeDriverManage bridgeDriverManage = new Client();

        /*调用第一个对象*/
        Driver mysqlDriver = new MysqlSub();
        bridgeDriverManage.setDriver(mysqlDriver);
        bridgeDriverManage.use();

        /*调用第二个对象*/
        Driver oracleDriver = new OracleSub();
        bridgeDriverManage.setDriver(oracleDriver);
        bridgeDriverManage.use();
    }
}
