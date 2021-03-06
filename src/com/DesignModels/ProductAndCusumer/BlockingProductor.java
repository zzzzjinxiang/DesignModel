package com.DesignModels.ProductAndCusumer;

import java.util.concurrent.BlockingQueue;

public class BlockingProductor implements Runnable {
    private final BlockingQueue blockingProductor;
    public BlockingProductor(BlockingQueue blockingProductor)
    {
        this.blockingProductor = blockingProductor;
    }
    @Override
    public void run(){
        for(int i=0;i<10;i++){
            try{
                System.out.println("生产苹果编号为"+i);
                blockingProductor.put(i);
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
