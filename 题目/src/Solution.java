import java.util.HashMap;

//给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target的那两个整数，
// 并返回它们的数组下标。
//        你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
//        你可以按任意顺序返回答案。
//        示例 1：
//        输入：nums = [2,7,11,15], target = 9
//        输出：[0,1]
//        解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
//        示例 2：
//
//        输入：nums = [3,2,4], target = 6
//        输出：[1,2]
//        示例 3：
//
//        输入：nums = [3,3], target = 6
//        输出：[0,1]
//        提示：
//        2 <= nums.length <= 104
//        -109 <= nums[i] <= 109
//        -109 <= target <= 109
//        只会存在一个有效答案
//        进阶：你可以想出一个时间复杂度小于 O(n2) 的算法吗？
//
public class Solution {
/**
 *自己写的，时间复杂度为on^2
 */


//    public  int[] twoSum(int[] nums, int target) {
//        int []  arr=new int [2];
//        for (int i = 0; i < nums.length; i++) {
//            for (int i1 = 1; i1 < nums.length; i1++) {
//                if (i==i1)break;
//                if ((nums[i]+nums[i1])==target){
//                    arr[0]=i1;
//                    arr[1]=i;
//                    return arr;
//                }
//            }
//        }
//        return arr;
//    }

    /**
     * 时间复杂度为n
     * @param nums
     * @param target
     * @return
     */
    public  int[] twoSum(int[] nums, int target) {
        int []  arr=new int [2];
        if(nums.length==0) return arr;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num =nums[i];
            int dif =target-num;
            if (map.containsKey(dif)){
                arr[0]=map.get(dif);
                arr[1]=i;
                return arr;
            }
            else{
                map.put(num,i);
            }
            }

        return arr;
    }

    public static void main(String[] args) {
        int []  arr={2,7,11,159};
        Solution solution = new Solution();
        solution.twoSum(arr,9);
    }
}
