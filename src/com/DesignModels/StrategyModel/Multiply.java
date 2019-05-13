package com.DesignModels.StrategyModel;

public class Multiply implements Caculator {
    @Override
    public int caculate(String exp) {
        String[] temp = exp.split("\\*");
        int[] nums = new int[temp.length];
        nums[0] = Integer.valueOf(temp[0]);
        nums[1] = Integer.valueOf(temp[1]);
        return nums[0] * nums[1];
    }
}
