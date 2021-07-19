package 第34题_在排序数组中查找元素的第一个和最后一个位置;
/*
给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
        如果数组中不存在目标值 target，返回 [-1, -1]。
        进阶：
        你可以设计并实现时间复杂度为 O(log n) 的算法解决此问题吗？
        示例 1：
        输入：nums = [5,7,7,8,8,10], target = 8
        输出：[3,4]
        示例 2：
        输入：nums = [5,7,7,8,8,10], target = 6
        输出：[-1,-1]
 */
//使用二分法
class Solution {
    public int[] searchRange(int[] nums, int target) {

        int firstPosition=0,lastPosition=0,pivot=0;
        int index[]= {-1,-1};
        if (nums.length==0){
            return index;
        }
        firstPosition=firstPosition(nums,target);
        lastPosition=lastPosition(nums,target);
        if (firstPosition==-1){
            return index;
        }

        index[0]=firstPosition;
        index[1]=lastPosition;

        return index;
    }

    public int lastPosition(int[] nums, int target) {
        int left=0,right=nums.length-1,pivot=0;
        while(left<right){
            pivot=(left+right+1)>>>1;

            if (target>nums[pivot]){
                left=pivot+1;
            }
            else  if (target==nums[pivot]){
                left=pivot;
            }
            else
            {
                right=right-1;
            }
        }
        return left;
    }

    public int firstPosition(int[] nums, int target) {
        int left=0,right=nums.length-1,pivot=0;
        while(left<right){
            pivot=(left+right)>>>1;

            if (target>nums[pivot]){
                left=pivot+1;
            }
            else if (nums[pivot]==target){
                right=pivot;
            }
            else
            {
                right=pivot-1;
            }

        }
        if(nums[left]==target){return left;}
        return -1;
    }


    public static void main(String[] args) {
        Solution mySolution = new Solution();
        int []arr ={1,2,2};
        int[] ints = mySolution.searchRange(arr, 2);

    }
}