package com.DesignModels.ContextModel;

public class test {

    public static void main(String[] args){
        Context context = new Context(2,3);
        Expression expression1 = new Plus();
        System.out.println(expression1.interpret(context));
        Expression expression2 = new Mul();
        System.out.println(expression2.interpret(context));
    }
}
