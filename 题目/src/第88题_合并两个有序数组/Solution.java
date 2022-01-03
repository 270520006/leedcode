package 第88题_合并两个有序数组;

import java.util.Arrays;

/**
 * @author zsp
 * @version 1.0
 * @date 2021/12/16 16:44
 */
public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < m+n; i++) {
            if (i<m){
                nums1[i]=nums1[i];
            }else
            {
                nums1[i]=nums2[i-m];
            }
        }
        Arrays.sort(nums1);
    }
}
