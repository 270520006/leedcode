package 第213题_打家劫舍II;

public class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n];
        if (n==1){return nums[0];}
        if (n==2){return nums[0]>nums[1]?nums[0]:nums[1];}
        dp[0]=nums[0];
        dp[1]=nums[0]>nums[1]?nums[0]:nums[1];
        for (int i = 2; i < nums.length; i++) {
            dp[i]=Math.max(dp[i-1],nums[i]+dp[i-2]);
        }
        if (dp[n-1]!=dp[n-2]){
            int min=nums[0]<nums[n-1]?nums[0]:nums[n-1];
            return (dp[n-1]-min)>dp[n-2]?(dp[n-1]-min):dp[n-2];
        }


        return dp[n-1];
    }


    public static void main(String[] args) {
        int []arr ={1,2,3,1};
        int rob = new Solution().rob(arr);
        System.out.println(rob);
    }
}
