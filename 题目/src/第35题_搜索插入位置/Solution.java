package 第35题_搜索插入位置;
//给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。
// 如果目标值不存在于数组中，返回它将会被按顺序插入的位置。 
//示例 1:
//输入: nums = [1,3,5,6], target = 5
//输出: 2

//示例 2:
//输入: nums = [1,3,5,6], target = 2
//输出: 1


class Solution {
    public int searchInsert(int[] nums, int target) {
        int left=0,right=nums.length-1,pivot=0;
        while(right>=left){
            pivot=left+(right-left)/2;
            if (target==nums[pivot]){
            return pivot;
            }
            if (target>nums[pivot]){
                left=pivot+1;
            }else {
                right=pivot-1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int arr[]={1,3,5,6};
        Solution solution = new Solution();
        int i = solution.searchInsert(arr, 2);
        System.out.println(i);
    }
}