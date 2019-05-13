package com.DesignModels.OberserModel;

public interface Subject{
    void put(Observer observer);
    void delete(Observer observer);
    void get();
    void notifyObservers(String msg);
}
