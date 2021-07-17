package 第4题_寻找两个正序数组的中位数;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double result= 0.0;
        int length=nums1.length+nums2.length;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : nums1) {
            list.add(i);
        }
        for (int i : nums2) {
            list.add(i);
        }
        List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
        if (length%2==0){
            result=(double)(sortedList.get(length/2-1)+sortedList.get(length/2))/2.0;
        }else{
            result =(double)sortedList.get(length/2);
        }

        return result;
    }


    public static void main(String[] args) {
        int []nums1={1,2};
        int []nums2={3,4};
        Solution solution = new Solution();
        double medianSortedArrays = solution.findMedianSortedArrays(nums1, nums2);
        System.out.println(medianSortedArrays);
    }
}