package 第1567题_乘积为正数的最长子数组长度;

/**
 * @author zsp
 * @version 1.0
 * @date 2022/1/4 16:40
 * 这道题需要进行分类讨论
 * 1）当前需要进行乘的值如果等于0则正负最长子数组长度均需重新置零
 * 重新从下一个数进行遍历
 * 2）当此时乘数为正时，此时维护的这个正子数组和长度+1
 * 且需要为下次迎接乘数为负数做准备，使得负数长度也+1
 * 3)如果当前乘数为负数，则需要先记录当前正数的子数组长度，
 * 此时正数子数组长度需要为下一次迎接负数做准备+1
 *
 * 作者：alascanfu
 * 链接：https://leetcode-cn.com/problems/maximum-length-of-subarray-with-positive-product/solution/1567-cheng-ji-wei-zheng-shu-de-zui-chang-0hsj/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */

public class Solution {
    public int getMaxLen(int[] nums) {
        int imax=0;
        int imin=0;
        int max=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]<0){
                int temp=imax;
                imax=imin;
                imin=temp;
                imin++;
                if (imax>0)imax++;
            }
            if (nums[i]==0){
                imax=0;
                imin=0;
            }
            if (nums[i]>0){
                imax++;
                if (imin >0) imin++;
            }
            max=Math.max(max,imax);
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[]={-1,2,3,4,-2};
        Solution solution = new Solution();
        int maxLen = solution.getMaxLen(arr);
        System.out.println(maxLen);
    }


}
