package 第53题_最大子序和;
//给定一个整数数组 nums ，找到一个具有最大和的连续子数组
//（子数组最少包含一个元素），返回其最大和。
//        示例 1：
//        输入：nums = [-2,1,-3,4,-1,2,1,-5,4]
//        输出：6
//        解释：连续子数组 [4,-1,2,1] 的和最大，为 6 。
//        示例 2：
//        输入：nums = [1]
//        输出：1
//        示例 3：
//        输入：nums = [0]
//        输出：0
 //这是我进入动态规划的第一题
public class Solution {
    public int maxSubArray(int[] nums) {
        int max=nums[0];
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            if (sum<0){
                sum=nums[i];
            }else{
                sum+=nums[i];
            }
            max=Math.max(max,sum);
        }
        return max;
    }

    public static void main(String[] args) {
        int []arr ={-2,1,-3,4,-1,2,1,-5,4};
        Solution solution = new Solution();
        int i = solution.maxSubArray(arr);
        System.out.println(i);
    }

}
