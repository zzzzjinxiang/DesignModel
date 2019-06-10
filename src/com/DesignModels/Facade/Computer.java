package com.DesignModels.Facade;

public class Computer {
    private CPU cpu;
    private DISK disk;
    private Memory memory;

    public Computer(){
        cpu = new CPU();
        disk = new DISK();
        memory = new Memory();
    }

    public void begin(){
        System.out.println("Computer begin");
        cpu.begin();
        disk.begin();
        memory.begin();
    }

    public void end(){
        System.out.println("Computer end");
        cpu.end();
        disk.end();
        memory.end();
    }

}
