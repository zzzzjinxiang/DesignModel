package com.DesignModels.OberserModel;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class monitorSubject implements Subject{

    private List<Observer> observers = new LinkedList<>();

    @Override
    public void put(Observer observer) {
        observers.add(observer);
        notifyObservers("new add user" + observer.toString());
    }

    @Override
    public void delete(Observer observer) {
        if(!observers.isEmpty()) {
            observers.remove(observer);
            notifyObservers("user leave");
        }
        else System.out.println("no submit user");
    }

    @Override
    public void get() {
        observers.get(0);
        notifyObservers("extract newest user");
    }

    @Override
    public void notifyObservers(String msg) {
        for(int i =0;i<observers.size();i++){
            observers.get(i).update("new Operation has been executed -> "+msg);
        }
    }
}
