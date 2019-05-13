package com.DesignModels.MVC;

public class Server {
    private Dispatcher dis;
    private Controller controller;
    private DAO model;

    public Server(){
        dis = new Dispatcher();
        controller = new Controller();
        model = new DAO();
    }

    public void startup(){
        dis.startup();
        controller.startup();
        model.startup();
    }

    public void shutdown(){
        controller.shutdown();
        model.shutdown();
        dis.shutdown();
    }
}
