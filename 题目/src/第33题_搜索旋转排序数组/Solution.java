package 第33题_搜索旋转排序数组;

import java.util.Arrays;

/*
        整数数组 nums 按升序排列，数组中的值 互不相同 。
        在传递给函数之前，nums 在预先未知的某个下标 k（0 <= k < nums.length）上进行了旋转，
        使数组变为 [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]]（下标 从 0 开始 计数）。
        例如， [0,1,2,4,5,6,7] 在下标 3 处经旋转后可能变为 [4,5,6,7,0,1,2] 。
        给你 旋转后 的数组 nums 和一个整数 target ，如果 nums 中存在这个目标值 target ，则返回它的下标，否则返回 -1 。
        示例 1：
        输入：nums = [4,5,6,7,0,1,2], target = 0
        输出：4
        示例 2：
        输入：nums = [4,5,6,7,0,1,2], target = 3
        输出：-1
 */
//
class Solution {
    public int search(int[] nums, int target) {
        int left=0,right=nums.length-1,pivos=0;
        while(right>=left){
            pivos=left+(right-left)/2;
            if (nums[pivos]==target){
                return pivos;
            }
            if(nums[pivos]>=nums[0]){
                if (target>=nums[left]&& target<nums[pivos]){
                    right=pivos-1;
                }else
                {
                    left=pivos+1;
                }
            }else {
                if (target>nums[pivos]&& target<=nums[right]){
                    left=pivos+1;
                }else
                {
                    right=pivos-1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {3,1};
        Solution mySolution = new Solution();
        int search = mySolution.search(arr, 1);
        System.out.println(search);
    }
}