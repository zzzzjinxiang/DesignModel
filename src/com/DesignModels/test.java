package com.DesignModels;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class test{

    public static void main(String[] args){
        /**
         *

        Scanner x = new Scanner(System.in);
        int T = x.nextInt();
        int[] nums = new int[T];
        for(int i=0;i<T;i++){
            nums[i]=x.nextInt();
        }*/
        int[] num = {67,32,54,22,78,92,3,99};
        int[] num2 = {3,0,6,2,4,7,0,0};
        int[] num3 = {1,3,5,4,7};//{8,9,5,6,7,1,2,3,};
        //System.out.println(f(num2,num2.length));
        //System.out.println(f(num));
        //List<List<Integer>>  res= new ArrayList<>();
        //res.get(0).add(1);
        System.out.println(findNumberOfLIS(num3));
        for(int x :f(0)){
            System.out.println(x);
        }


    }

    public static int findNumberOfLIS(int[] nums) {
        int res = 0;
        int max = 1;
        int[] dp = new int[nums.length];
        int[] comb = new int[nums.length];
        Arrays.fill(dp,1);
        Arrays.fill(comb,1);
        for(int i=1;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[i] > nums[j] &&dp[j]+1 > dp[i])
                {
                    dp[i] = dp[j]+1;
                    comb[i] = comb[j];
                } else if(dp[j]+1 == dp[i])
                    comb[i] += comb[j];
            }
            max = Math.max(max,dp[i]);
        }

        for(int i=0;i<nums.length;i++){
            if(dp[i] == max) res+=comb[i];
        }
        return res;
    }
    public static List<Integer> f(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        res.add(1);
        //if(rowIndex==0)
            //return res;

        for(int row = 1; row<rowIndex+1;row++){
            List<Integer> list = new ArrayList<>();
            list.add(1);
            for(int i=1 ; i<row ; i++){
                list.add(res.get(i-1)+res.get(i));
            }
            list.add(1);
            res=list;
        }
        return res;
    }

    /**
    public static int f(int[] nums,int len) {
        if(nums.length==0) return 0;
        int max = 1;
        int ans = 1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                max++;
            }else {
                if(ans>max)
                    ans = max;
                max = 1;
            }
        }
        return Math.max(ans,max);
    }

    public static int f( int[] nums){
        if(nums.length<=1)
            return nums.length;
        int[] dp = new int[nums.length];
        Arrays.fill(dp,1);
        for(int i=1;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i] && dp[j]+1>dp[i]){
                    dp[i]=dp[j]+1;
                }
            }
        }
        int max = 0;
        for(int i=0;i<nums.length;i++){
            if(dp[i]>max)
                max = dp[i];
        }

        return max;
    }*/
}
