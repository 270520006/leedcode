package 第740题_删除并获得点数;

public class Solution {
    public int deleteAndEarn(int[] nums) {
        int len=nums.length;
        int max =nums[0];
        if (len==1){return nums[0];}

        for (int num : nums) {
            max=Math.max(num,max);
        }

        int arr[]=new int[max+1];
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]]++;
        }
        int dp[]=new int[max+1];
        dp[1]=arr[1];
        dp[2]=Math.max(dp[1],arr[2]*2);
        for (int i = 2; i <= max; i++) {
            dp[i]=Math.max(dp[i-1],arr[i]*i+dp[i-2]);
        }
        return dp[max];
    }

    public static void main(String[] args) {
        int arr[]={3,1};
        Solution solution = new Solution();
        int i = solution.deleteAndEarn(arr);
        System.out.println(i);
    }
}
