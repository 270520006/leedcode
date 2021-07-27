package 华为笔试题.喊7的次数重排;

import java.util.HashMap;

public class Solution {
    public int[] getSeven(int arr[]){
        int []map = new int[53];
        int time=0;
        int sum=0;
        int n=arr.length;
        int sevens[]=new int[n];
        for (int i = 1; i <=200 ; i++) {
            if (i%7==0){
                time++;
                map[time-1]=i;
            }
            else if (i%10==7){
                time++;
                map[time-1]=i;
            }
            else if (i/10==7){
                time++;
                map[time-1]=i;
            }
        }

        for (int i = 0; i <arr.length; i++) {
            if (arr[i]!=0){
                sum+=arr[i];
            }
        }
        if (sum<1){return arr;}
        for (Integer i = 1; i <= map[sum-1]; i++) {
            if (i%7==0){
                if (i%n==0){sevens[n-1]++;}
                if (i%n-1>0){sevens[i%n-1]++;}

            }else if (i%10==7){
                if (i%n==0){sevens[n-1]++;}
                if (i%n-1>0){sevens[i%n-1]++;}
            }
            else if (i/10==7){
                if (i%n==0){sevens[n-1]++;}
                if (i%n-1>0){sevens[i%n-1]++;}
            }
        }
        return sevens;
    }


}
