package 第977题_有序数组的平方;
//给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。
//        输入：nums = [-4,-1,0,3,10]
//        输出：[0,1,9,16,100]
//        解释：平方后，数组变为 [16,1,0,9,100]
//        排序后，数组变为 [0,1,9,16,100]
//        示例 2：
//        输入：nums = [-7,-3,2,3,11]
//        输出：[4,9,9,49,121]

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public int[] sortedSquares(int[] nums) {
        int arr[]=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i]=nums[i]*nums[i];
        }
        Arrays.sort(arr);

        return arr;
    }

    public static void main(String[] args) {
        int []arr ={-4,-1,0,3,10};
        Solution solution = new Solution();
        int[] ints = solution.sortedSquares(arr);
        ArrayList<Object> objects = new ArrayList<>();
        objects.remove("s");
    }
}