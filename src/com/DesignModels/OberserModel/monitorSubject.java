package com.DesignModels.OberserModel;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class monitorSubject implements Subject{

    private List<Observer> observers = new LinkedList<>();
    String msg;

    @Override
    public void put(Observer observer) {
        observers.add(observer);
        notifyNewUser("new custom join",observer);
    }

    @Override
    public void delete(Observer observer) {
        if(!observers.isEmpty()) {
            observers.remove(observer);
            notifyNewUser("JpaUse leaves",observer);
        }
        else System.out.println("no submit JpaUse");
    }

    @Override
    public void get() {
        observers.get(0);
        notifyNewUser("extract newest JpaUse",observers.get(0));
    }

    public void notifyNewUser(String msg,Observer observer){
        observer.update(msg);
    }

    public void send(String s){
        this.msg = s;
        System.out.println("users update:" + s);
        notifyObservers(s);
    }

    @Override
    public void notifyObservers(String msg) {
        for(Observer observer : observers){
            observer.update(msg);
        }

    }
}
