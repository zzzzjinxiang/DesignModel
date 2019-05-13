package com.DesignModels.TemplateModel;

public abstract class AbstractTools {

    public final int caculate(String exp,String opr){
        int[] array = split(exp,opr);
        return calculate(array[0],array[1]);
    }

    abstract public int calculate(int num1,int num2);

    public int[] split(String exp,String opr){
        String[] temp = exp.split(opr);
        int[] nums = new int[temp.length];
        nums[0] = Integer.valueOf(temp[0]);
        nums[1] = Integer.valueOf(temp[1]);
        return nums;
    }
}
