package com.DesignModels.TemplateModel;

public class test {
    public static void main(String[] args){
        String state = "3-2";
        AbstractTools caculator = new Minus();
        System.out.println(caculator.caculate(state,"\\-"));
    }
}
