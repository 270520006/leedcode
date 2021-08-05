package 第55题_跳跃游戏;

public class Solution {
    public boolean canJump(int[] nums) {
        int len=nums.length;
        int maxLen=0;
        for (int i = 0; i < nums.length; i++) {
            if (i<=maxLen){
                maxLen=Math.max(maxLen,nums[i]+i);
                if (maxLen>=len-1){
                    return true;
                }
            }
        }
        return false;
    }
}
