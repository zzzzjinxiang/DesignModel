package com.DesignModels.OberserModel;

public class test {
    public static void main(String[] args){
        Observer user1 = new Observer1();
        Observer user2 = new Observer2();
        Observer user3 = new Observer2();
        monitorSubject monitor = new monitorSubject();
        monitor.put(user1);
        monitor.put(user2);
        monitor.put(user3);
        monitor.delete(user2);
        monitor.get();
    }
}
