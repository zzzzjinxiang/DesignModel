package com.DesignModels.BridgeModel;

public class test {

    public static void main(String[] args) {

        BridgeDriverManage bridgeDriverManage = new Client();

        /*调用第一个对象*/
        Driver driver1 = new MysqlSub();
        bridgeDriverManage.setDriver(driver1);
        bridgeDriverManage.use();

        /*调用第二个对象*/
        Driver driver2 = new OracleSub();
        bridgeDriverManage.setDriver(driver2);
        bridgeDriverManage.use();
    }
}
