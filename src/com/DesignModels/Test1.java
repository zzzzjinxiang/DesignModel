package com.DesignModels;

import java.lang.annotation.ElementType;

public class Test1 {
    public static void main(String[] args){
        //初始化Bean1
        Test1 test1 = new Test1();
        Test1.Bean1 bean1 = test1.new Bean1();
        Test1.Bean2 bean2 = new Bean2();
        Bean bean = new Bean();
        Bean.Bean3 bean3 = bean.new Bean3();
    }
    class Bean1{
        public int I = 0;
        public void print(){
            System.out.println(I);
        }
    }
    static class Bean2{
        public int J = 1;
        public void print(){
            System.out.println(J);
        }
    }
}
class Bean{
    class Bean3{
        public int k = 2;
        public void print(){
            System.out.println(k);
        }
    }
}
