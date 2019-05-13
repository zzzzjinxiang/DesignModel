package com.DesignModels.StrategyModel;

public class test {
    public static void main(String[] args){
        String state = "3*2";
        Caculator caculator = new Plus();
        System.out.println(caculator.caculate(state));
    }

}
