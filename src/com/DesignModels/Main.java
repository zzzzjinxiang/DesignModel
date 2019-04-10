package com.DesignModels;

import com.DesignModels.StateModel.Context;
import com.DesignModels.StateModel.FreeState;
import com.DesignModels.StateModel.OrderState;
import com.DesignModels.StateModel.SettleState;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Main {
    public native int hashCode();

    public static void main(String[] args) {
        int[] a = {5,8,4,3,6,1,2,9};
        int y = 2;
        ArrayList<Integer> list = new ArrayList<>();
        for(int x:a){
            list.add(x^y);
            System.out.println(list.hashCode());
        }

        /**write your code here
         *@see 状态模式测试demo
         *@show 状态转移
        Integer state=0;
        Context context =new Context();
        OrderState newO = new OrderState();
        state = context.setState(newO,state);
        context.judgeState(state);
        state = context.setState(new FreeState(),state);
        state = context.setState(new SettleState(),state);
        */

        
    }
}
