package com.DesignModels.StateModel;

import com.DesignModels.TipsEnum.OrderEnum;

public class Context {
    private ConditionModel state;
    public int setState(ConditionModel s,int nameState){
        System.out.println("msg changed");
        state = s;
        if(nameState==1 || nameState==-1 || nameState==2){
            System.out.println(""+ OrderEnum.ERROR_ORDER.getMsg());
            return nameState;
        }
        System.out.println("预定成功");
        return s.handle();
    }

    public void exitRoom(ConditionModel s,int nameState){

    }

    public int judgeState(int nameState){
        if(nameState==1){
            System.out.println(OrderEnum.ORDERED.getMsg()+OrderEnum.ERROR_ORDER.getMsg());
            return nameState;
        }else if (nameState==0){
            System.out.println(""+OrderEnum.FREE.getMsg());
            return nameState;
        }else {
            System.out.println(""+ OrderEnum.SETTLEIN.getMsg()+OrderEnum.ERROR_ORDER.getMsg());
            return nameState;
        }
    }
}
