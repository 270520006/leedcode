package 第217题_存在重复元素;

import java.util.HashMap;
//217. 存在重复元素
//        给定一个整数数组，判断是否存在重复元素。
//        如果存在一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false 。
//        示例 1:
//        输入: [1,2,3,1]
//        输出: true
//        示例 2:
//        输入: [1,2,3,4]
//        输出: false
public class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map= new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(nums[i])) {
                return true;
            }
            map.put(nums[i],i);
        }
        return false;

    }

    public static void main(String[] args) {
        int arr[] ={1,2,3,312321,4,312321,};
        Solution solution = new Solution();
        boolean flag = solution.containsDuplicate(arr);
        System.out.println(flag);
    }
}
