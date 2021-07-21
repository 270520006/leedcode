package 第162题_寻找峰值;
//寻找峰值
//峰值元素是指其值大于左右相邻值的元素。
//        给你一个输入数组 nums，找到峰值元素并返回其索引。数组可能包含多个峰值，
//        在这种情况下，返回 任何一个峰值 所在位置即可。
//        你可以假设 nums[-1] = nums[n] = -∞ 。
// 示例 1：
//         输入：nums = [1,2,3,1]
//         输出：2
//         解释：3 是峰值元素，你的函数应该返回其索引 2。
//         示例 2：
//         输入：nums = [1,2,1,3,5,6,4]
//         输出：1 或 5
//         解释：你的函数可以返回索引 1，其峰值元素为 2；
//              或者返回索引 5， 其峰值元素为 6。

//解题过程
// 1、二分法找到中间值，然后找到第一个前面的值大于后面的值的数
// 2、将右节点设置为该中间值，此时左节点应该在中间值前面一位，右节点在中间值上
// 3、下次的中间值会是左节点位置，然后会和已经得到的峰值做比较，如果大于，则再次移动右指针
// 4、如果没有，则说明中间值大于两边，是峰值！
public class Solution {
    public int findPeakElement(int[] nums) {
        int left=0,right=nums.length-1,povis=0;
        while(right>left){
            povis=left+(right-left)/2;
            if (nums[povis]>nums[povis+1]){
                right=povis;
            }
            else
            {
                left=povis+1;
            }

        }
        return left;
    }

    public static void main(String[] args) {
        int []arr={1,0,1,3,5,6,4};
        Solution mySolution = new Solution();
        int peakElement = mySolution.findPeakElement(arr);
        System.out.println(peakElement);
    }
}
