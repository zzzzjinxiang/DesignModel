package com.DesignModels.StateModel;

public class test {
    public static void main(String[] args){
        Integer state=0;
        Context context =new Context();
        OrderState newO = new OrderState();
        state = context.setState(newO,state);
        context.judgeState(state);
        state = context.setState(new FreeState(),state);
        state = context.setState(new SettleState(),state);
    }
}
